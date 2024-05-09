package com.example.likelion.test.user.repository;

import com.example.likelion.test.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
    //userId
    Optional<User> findByUserId(String userId); //서비스 계층에서 사용
}

