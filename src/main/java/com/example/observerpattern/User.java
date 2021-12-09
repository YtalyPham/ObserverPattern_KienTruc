package com.example.observerpattern;

import lombok.Data;

@Data
public class User {
    private String email;
    private String ip;
    private LoginStatus status;
}
