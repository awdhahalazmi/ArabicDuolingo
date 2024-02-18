package com.ArabicDuolingo.Arabic.duolingo.service.user;

import com.ArabicDuolingo.Arabic.duolingo.bo.user.CreateUserRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.user.UpdateUserStatusRequest;
import com.ArabicDuolingo.Arabic.duolingo.entity.UserEntity;
import com.ArabicDuolingo.Arabic.duolingo.repository.UserRepository;
import org.hibernate.engine.spi.Status;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
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
        userRepository.save(userEntity);

    }

    @Override
    public void updateUserStatus(Long userId, UpdateUserStatusRequest updateUserStatusRequest) {
        UserEntity userEntity=userRepository.findById(userId).orElseThrow();
        if (!updateUserStatusRequest.getStatus().equals("ACTIVE") && !updateUserStatusRequest.getStatus().equals("INACTIVE")){
            throw new IllegalArgumentException("Error. The status must be either ACTIVE or INACTIVE");
        }
        userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}
