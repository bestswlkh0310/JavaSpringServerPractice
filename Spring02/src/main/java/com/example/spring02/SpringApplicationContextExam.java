package com.example.spring02;

import exam.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextExam {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Book book1 = context.getBean("book1", Book.class);
        book1.setTitle("Adad");
        System.out.println(book1.getTitle());
    }
}
