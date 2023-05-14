package com.example.spring02.component;

import org.springframework.stereotype.Component;

// AnnotaionConfigApplicationContext가 @Component를 찾아서 인스턴스 생성
@Component(value = "util1")
public class Util {
    public Util() {
        System.out.println("init Util");
    }
    public void print() {
        System.out.println("Util print()");
    }
}