package com.example.spring02;

import com.example.spring02.component.Dao;
import com.example.spring02.component.Service;
import com.example.spring02.component.Util;
import exam.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringApplicationContextExam3 {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.example.spring02");

        Book book1 = context.getBean("book1", Book.class);
        book1.setTitle("hello");

        // singleton
        Book book2 = context.getBean("book1", Book.class);
        System.out.println(book2.getTitle());

        // another instance
        Book book3 = context.getBean("book2", Book.class);
        System.out.println(book3.getTitle());
        System.out.println(book3.getPrice());

//        Dao dao = context.getBean("dao", Dao.class)
//        dao.get();

        Service service = context.getBean("service1", Service.class);
        service.service();

        Util util = context.getBean("util1", Util.class);
        util.print();
    }
}
