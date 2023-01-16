package com.example.services;

import org.springframework.stereotype.Service;

@Service
public class SayHelloService {
    public String print() {
        return "Hello world!";
    }
}