package com.example.likelion.test.user.controller;

import com.example.likelion.test.user.dto.UserSignupDto;
import com.example.likelion.test.user.service.UserService;
import com.example.likelion.util.response.CustomApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService; //서비스 계층 이용

    @PostMapping("signup")
    public ResponseEntity<CustomApiResponse<?>> signup(@RequestBody UserSignupDto dto) {
        return userService.signup(dto);


    }
}
