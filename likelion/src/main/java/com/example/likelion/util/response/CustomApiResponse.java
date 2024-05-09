package com.example.likelion.util.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CustomApiResponse<T> {
    //status, data, message
    private int status;
    private T data;
    private String message;

    public static <T> CustomApiResponse<T> createSuccess(int status, T data, String message) {
        return new CustomApiResponse<>(status, data,message);
    }

    //실패
    public static <T> CustomApiResponse<T> createFailWithout(int status, String message) {
        return new CustomApiResponse<>(status, null,message);
    }

//    public CustomApiResponse(int status, T data, String message) {
//        this.status = status;
//        this.data = data;
//        this.message = message;
//    }

//    public int getStatus() {
//        return status;
//    }
//
//    public void setStatus(int status) {
//        this.status = status;
//    }
//
//    public T getData() {
//        return data;
//    }
//
//    public void setData(T data) {
//        this.data = data;
//    }
//
//    public String getMessage() {
//        return message;
//    }
//
//    public void setMessage(String message) {
//        this.message = message;
//    }
//    롬복으로 처리

}
