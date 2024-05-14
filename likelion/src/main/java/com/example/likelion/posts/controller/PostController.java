package com.example.likelion.posts.controller;

import com.example.likelion.posts.dto.PostCreateDto;
import com.example.likelion.posts.service.PostService;
import com.example.likelion.util.response.CustomApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.apache.catalina.connector.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/post")
public class PostController {
    private final PostService postService;

    @PostMapping
    public ResponseEntity<CustomApiResponse<?>> createPost(
            @Valid @RequestBody PostCreateDto.Req req){
        ResponseEntity<CustomApiResponse<?>> result =postService.createPost(req);
        return result;
    }
}
