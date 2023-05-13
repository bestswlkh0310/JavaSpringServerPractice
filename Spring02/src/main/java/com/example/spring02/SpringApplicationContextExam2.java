package com.example.spring02;

import com.example.spring02.component.Dao;
import com.example.spring02.component.Service;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplicationContextExam2 {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Service service = context.getBean("service", Service.class);
        Dao dao = context.getBean("dao", Dao.class);

        service.service();
    }
}
