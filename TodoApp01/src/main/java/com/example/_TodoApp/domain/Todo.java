package com.example._TodoApp.domain;

import jakarta.persistence.*;
import lombok.*;

@Entity(name = "Todo")
@Table(name = "Todo")
@AllArgsConstructor
@NoArgsConstructor(force = true)
@Getter
@Setter
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String todo;
}
