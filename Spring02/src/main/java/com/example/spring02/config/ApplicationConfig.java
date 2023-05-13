package com.example.spring02.config;


import com.example.spring02.component.Dao;
import com.example.spring02.component.Service;
import exam.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// Java Config Setting - AnnotationConfigApplicationContext 가 읽음
// => ApplicationConfig 인스턴스 생성
@Configuration
public class ApplicationConfig {
    public ApplicationConfig() {
        System.out.println("ApplicationConfig()");
    }

    // Bean - Spring 이 관리하는 객체 (보통 Singleton)
    @Bean
    public Book book1() {
        return new Book();
    }

    @Bean
    public Book book2() {
        return new Book("book2", 200);
    }

    @Bean(name = "service1")
    public Service service(Dao dao) {
        Service service = new Service();
        service.setDao(dao);
        return service;
    }

    @Bean
    public Dao dao() {
        return new Dao();
    }
//    @Bean
//    public Util util() {
//        return new Util();
//    }
}
