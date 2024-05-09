package com.example.likelion.test.tmp.dto;

import lombok.*;

@Getter
@Setter
@Builder //builder 패턴 사용
@NoArgsConstructor
@AllArgsConstructor
public class SimpleDto {
    private String userId;
    private String email;
}
