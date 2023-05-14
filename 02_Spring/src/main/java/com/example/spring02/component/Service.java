package com.example.spring02.component;

public class Service {
    public void setDao(Dao dao) {
        this.dao = dao;
    }

    private Dao dao;
    public void service() {
        System.out.println("service");
        dao.get();
    }
}
