package com.example.corsprac.controller;

import com.example.corsprac.dto.UserRequestDto;
import com.example.corsprac.model.User;
import com.example.corsprac.userservice.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/user/signup")
    public User signup(@RequestBody UserRequestDto userRequestDto){
        return userService.signup(userRequestDto);
    }

    @PostMapping("/user/userinfo")
    public void getUserInfo(@RequestBody UserRequestDto userRequestDto) {

    }
}
