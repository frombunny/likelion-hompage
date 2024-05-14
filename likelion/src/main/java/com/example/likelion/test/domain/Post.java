package com.example.likelion.test.domain;

import com.example.likelion.util.entity.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.prefs.BackingStoreException;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="POSTS")
@Builder
public class Post extends BaseEntity {
    @Id @GeneratedValue
    @Column(name="POST_ID")
    private Long id;

    @Column(name="POST_TITLE")
    private String title;

    @Column(name="POST_CONTENT")
    private String content;

    @Column(name="POST_USER_NAME")
    private String postedUserName;

    @Column(name="POST_PASSWORD")
    private String password;
}
