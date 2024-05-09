package com.example.likelion.test.user.service;

import com.example.likelion.test.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor //자동 주입
public class UserService {
    private final UserRepository UserRepository;

//    @Autowired UserService(UserRepository userRepository) {
//        this.UserRepository = userRepository;
//    }

    //회원 가입 로직 작성
}


