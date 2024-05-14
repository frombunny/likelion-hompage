package com.example.likelion.posts.service;

import com.example.likelion.domain.Post;
import com.example.likelion.posts.dto.PostCreateDto;
import com.example.likelion.posts.repository.PostRepository;
import com.example.likelion.util.response.CustomApiResponse;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Builder
public class PostServiceImpl implements PostService{
    private final PostRepository postRepository;

    @Override
    public ResponseEntity<CustomApiResponse<?>> createPost(PostCreateDto.Req req) {
        //1. toEntity() 메서드를 호출하여 엔티티 객체를 생성
        Post post = req.toEntity();

//        //2. Builder 사용
//        Post post=Post.builder()
//                .title(req.getTitle())
//                .content(req.getContent())
//                .password(req.getPassword())
//                .postedUserName(req.getPostedUserName())
//                .build();
        Post savedPost=postRepository.save(post);

        PostCreateDto.CreatePost createdPostResponse=new PostCreateDto.CreatePost(savedPost.getId(),
                savedPost.getUpdatedAt());

        CustomApiResponse<PostCreateDto.CreatePost> res=CustomApiResponse.createSuccess(HttpStatus.OK.value(),
                createdPostResponse,"게시글이 작성되었습니다.");
        return ResponseEntity.ok(res);

    }
}
