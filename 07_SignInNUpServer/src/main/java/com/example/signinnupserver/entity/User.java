package com.example.signinnupserver.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class User {
    /**
     * id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idx;
    /**
     * 이름
     */
    @Column(nullable = false)
    private String name;
    /**
     * 아이디
     */
    @Column(nullable = false)
    private String id;
    /**
     * 비밀번호
     */
    @Column(nullable = false)
    private String password;
}
