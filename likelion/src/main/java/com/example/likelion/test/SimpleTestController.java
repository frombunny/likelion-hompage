package com.example.likelion.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // SimpleTestController 클래스가 RESTful 웹서비스의 Controller임을 나타냄
@RequestMapping("/api/simpleText")
public class SimpleTestController {
    // GET http://localhost:8080/api/simpleText/success
    @GetMapping("/success")
    public String simpleTextSuccess() {
        return "안녕";
    }

    // GET http://localhost:8080/api/simpleText/success
    @GetMapping("/api/simpleText/fail")
    public String simpleTextFail() {
        return "안녕";
    }
}
