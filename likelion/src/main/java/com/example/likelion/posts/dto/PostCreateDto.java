package com.example.likelion.posts.dto;

import com.example.likelion.domain.Post;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

public class PostCreateDto {
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class Req{
        @NotBlank(message="작성자 이름은 비어 있을 수 없습니다.")
        private String postedUserName; //작성자 이름

        @NotBlank(message="비밀번호는 비어 있을 수 없습니다.")
        private String password; //비밀 번호

        @NotBlank(message="게시물 제목은 비어 있을 수 없습니다.")
        private String title; //게시물 제목

        @NotBlank(message="게시물 내용은 비어 있을 수 없습니다.")
        private String content; //게시물 내용

        public Post toEntity(){
            return Post.builder()
                    .postedUserName(postedUserName)
                    .password(password)
                    .title(title)
                    .content(content)
                    .build();
        }
    }

    //게시글 작성 : postId, updateAt
    @Getter
    @Builder
    @NoArgsConstructor(access = AccessLevel.PROTECTED)
    public static class CreatePost{
        private Long postId;
        private LocalDateTime updatedAt;

        public CreatePost(Long postId, LocalDateTime updatedAt) {
            this.postId = postId;
            this.updatedAt = updatedAt;
        }
    }

}
