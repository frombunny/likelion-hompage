package com.example.likelion.test;

import com.example.likelion.util.response.CustomApiResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customResponse")
public class CustomTestController {
    @PostMapping("/simple")
    public ResponseEntity<CustomApiResponse<?>> simple(){
        //1. 응답 body 구성
        CustomApiResponse<Object> responseBody = CustomApiResponse.createSuccess
                (HttpStatus.OK.value(), null, "회원 가입에 성공했습니다.");

        //2. 응답 body를 ReponseEntity에 넣기
        return ResponseEntity.status(HttpStatus.OK).body(responseBody);
    }

    @GetMapping("/jsonData")
    public ResponseEntity<CustomApiResponse<?>> jsonData(){
        CustomApiResponse<Object> reponseBody=CustomApiResponse.createSuccess
                (HttpStatus.OK.value(), "","회원 조회에 성공했습니다.");

        return ResponseEntity.status(HttpStatus.OK).body(reponseBody);
    }
}
