package com.example.likelion.domain;

import com.example.likelion.util.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="POSTS")
@Builder

public class Post  extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name="POSTS_ID")
    private Long id; //글 고유의 아이디

    @Column(name="POSTS_TITLE")
    private String title; // 글 제목

    @Column(name="POSTS_CONTENT")
    private String content; //글 내용

    @Column(name="POSTED_USER_NAME")
    private String postedUserName; //작성자

    @Column(name="POSTS_PASSWORD")
    private String password; //비밀 번호
}
