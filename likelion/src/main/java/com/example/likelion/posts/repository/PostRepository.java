package com.example.likelion.posts.repository;

import com.example.likelion.test.domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {

}
