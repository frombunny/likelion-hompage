package com.example.likelion.posts.controller;

import com.example.likelion.posts.dto.PostCreateDto;
import com.example.likelion.posts.dto.PostUpdateDto;
import com.example.likelion.posts.service.PostService;
import com.example.likelion.util.response.CustomApiResponse;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @PutMapping("/{postId}")
    public ResponseEntity<CustomApiResponse<?>> modifyPost(
            @PathVariable("postId") Long postId,
            @RequestBody PostUpdateDto.Req req){
        ResponseEntity<CustomApiResponse<?>> result = postService.modifyPost(postId, req);
        return result;
    }
}
