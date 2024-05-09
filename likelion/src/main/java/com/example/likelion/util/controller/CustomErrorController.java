package com.example.likelion.util.controller;

import com.example.likelion.util.response.CustomApiResponse;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //RESTful 웹 서비스의 컨트롤러임을 나타냄
public class CustomErrorController implements ErrorController {

    @RequestMapping("/error")//error 경로로 들어오는 요청을 이 클래스의 메소드로 매핑
    public ResponseEntity<CustomApiResponse<?>> handleError(HttpServletRequest request) {
        //HttpServletRequest로부터 status code 가져오기
        Object status= request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if(status != null){
            int statusCode = Integer.parseInt(status.toString());

            //Bad Request (400)
            if(statusCode == HttpStatus.BAD_REQUEST.value()){ //statusCode==400
                return ResponseEntity
                        .status(HttpStatus.BAD_REQUEST)
                        .body(new CustomApiResponse<>(HttpStatus.BAD_REQUEST.value(),null,"잘못된 요청입니다."));
            }

            //Forbidden (403)
            else if(statusCode == HttpStatus.FORBIDDEN.value()){ //statusCode==403
                return ResponseEntity
                        .status(HttpStatus.FORBIDDEN)
                        .body(new CustomApiResponse<>(HttpStatus.FORBIDDEN.value(),null,"접근이 금지되었습니다."));
            }

            //Not found (404)
            else if(statusCode == HttpStatus.NOT_FOUND.value()){ //statusCode==404
                return ResponseEntity
                        .status(HttpStatus.NOT_FOUND)
                        .body(new CustomApiResponse<>(HttpStatus.NOT_FOUND.value(),null,"요청을 찾을 수 없습니다."));
            }

            //Method Not Allowed (405) : 경로는 있으나, 메소드 발생 X
            else if(statusCode == HttpStatus.METHOD_NOT_ALLOWED.value()){ //statusCode==403
                return ResponseEntity
                        .status(HttpStatus.METHOD_NOT_ALLOWED)
                        .body(new CustomApiResponse<>(HttpStatus.METHOD_NOT_ALLOWED.value(),null,"허용되지 않는 메소드입니다."));
            }

            //Internal Server  Error (500)
            else{
                return ResponseEntity
                        .status(HttpStatus.INTERNAL_SERVER_ERROR)
                        .body(new CustomApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),null,"내부 서버 오류가 발생했습니다."));
            }
        }
        //status code에 따라 응답을 다르게 내려줘야 함

        return ResponseEntity
                .status(HttpStatus.INTERNAL_SERVER_ERROR)
                .body(new CustomApiResponse<>(HttpStatus.INTERNAL_SERVER_ERROR.value(),null,"내부 서버 오류가 발생했습니다."));
    }
}
