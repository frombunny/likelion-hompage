package com.example.likelion.test;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
//요청을 받는 Dto에는 builder 필요 없음
public class SignupDto {

    @NotEmpty(message = "userId는 필수 값입니다.")//빈 값이 들어올 수 없다 -> 비어 있을 수 없습니다!
    private String userId;

    @Email(message = "이메일 형식을 맞춰주세요.")
    private String email;
    private String password;
}
