package com.ArabicDuolingo.Arabic.duolingo.service.user;

import com.ArabicDuolingo.Arabic.duolingo.bo.user.CreateUserRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.user.UpdateUserStatusRequest;
import com.ArabicDuolingo.Arabic.duolingo.entity.UserEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.UserRepository;
import org.hibernate.engine.spi.Status;

import java.util.List;
import java.util.stream.Collectors;

public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    @Override
    public void saveUser(CreateUserRequest createUserRequest) {
        UserEntity userEntity= new UserEntity();
        userEntity.setName(createUserRequest.getName());
        userEntity.setEmail(createUserRequest.getEmail());
        userEntity.setStatus(Status.valueOf(createUserRequest.getStatus()));
        userRepository.save(userEntity);

    }

    @Override
    public void updateUserStatus(Long userId, UpdateUserStatusRequest updateUserStatusRequest) {
        UserEntity userEntity=userRepository.findById(userId).orElseThrow();
        if (!updateUserStatusRequest.getStatus().equals("ACTIVE") && !updateUserStatusRequest.getStatus().equals("INACTIVE")){
            throw new IllegalArgumentException("Error. The status must be either ACTIVE or INACTIVE");
        }
        userEntity.setStatus(Status.valueOf(updateUserStatusRequest.getStatus()));
        userRepository.save(userEntity);
    }

    @Override
    public List<String> getAllUsers() {
        return userRepository.findAll()
                .stream()
                .filter(e -> e.getPassword().length() >8)
                .map(UserEntity ::getName)
                .collect(Collectors.toList());
    }
}
