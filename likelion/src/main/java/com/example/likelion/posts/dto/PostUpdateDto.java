package com.example.likelion.posts.dto;

import com.example.likelion.domain.Post;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;

public class PostUpdateDto {
    @Getter
    @Setter
    @Builder
    @AllArgsConstructor
    @NoArgsConstructor(access = AccessLevel.PROTECTED)

    public static class Req {
        private Long postId;
        private String password;
        private String postedUserName;
        private String title;
        private String content;
    }

        //수정 api Response
        @Getter
        @Builder
        @NoArgsConstructor(access = AccessLevel.PROTECTED)
        public static class UpdatePost{
            private LocalDateTime updatedAt;

            public UpdatePost(LocalDateTime updatedAt) {
                this.updatedAt = updatedAt;
            }
        }

}
