package com.ArabicDuolingo.Arabic.duolingo.controllers.user;

import com.ArabicDuolingo.Arabic.duolingo.bo.user.CreateUserRequest;
import com.ArabicDuolingo.Arabic.duolingo.bo.user.UpdateUserStatusRequest;
import com.ArabicDuolingo.Arabic.duolingo.service.user.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }
    @PostMapping("/createUser")
    public ResponseEntity<String> createUser(@RequestBody CreateUserRequest createUserRequest){
        try {
            userService.saveUser(createUserRequest);
        }catch(IllegalArgumentException e){
            return ResponseEntity.badRequest().body(e.getMessage());
        }

        return ResponseEntity.ok("User created successfully");
    }
    @PutMapping("/updatedUserStatus")
    public ResponseEntity<String> updateUser(@RequestParam Long userId, @RequestBody UpdateUserStatusRequest updateUserStatusRequest){
        try {
            userService.updateUserStatus(userId, updateUserStatusRequest);
        }catch(IllegalArgumentException e){

            return ResponseEntity.badRequest().body(e.getMessage());
        }
        return  ResponseEntity.ok("User updated successfully");
    }
}
