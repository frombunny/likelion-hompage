package com.example.likelion.posts.service;

import com.example.likelion.posts.dto.PostCreateDto;
import com.example.likelion.posts.dto.PostUpdateDto;
import com.example.likelion.util.response.CustomApiResponse;
import org.springframework.http.ResponseEntity;

public interface PostService {
    ResponseEntity<CustomApiResponse<?>> createPost(PostCreateDto.Req req);

    ResponseEntity<CustomApiResponse<?>> modifyPost(Long postId, PostUpdateDto.Req req);
}
