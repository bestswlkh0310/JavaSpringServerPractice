package com.example._TodoApp.controller;

import com.example._TodoApp.domain.Todo;
import com.example._TodoApp.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class TodoController {
    private final TodoRepository todoRepository;

    @GetMapping("/")
    public String index(Model model) {
        List<Todo> todoList = todoRepository.findAll();
        model.addAttribute("todoList", todoList);
        return "todos";
    }

    @PostMapping("/addTodo")
    public String addTodo(@RequestParam("todo") String todoText) {
        Todo todo = new Todo();
        todo.setTodo(todoText);
        todoRepository.save(todo);
        return "redirect:/";
    }
}
