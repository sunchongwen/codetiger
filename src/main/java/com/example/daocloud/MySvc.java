package com.example.daocloud;

import org.springframework.stereotype.Service;

@Service
public class MySvc {
    public static int add(int a, int b){
        return a+b;
    }
}
