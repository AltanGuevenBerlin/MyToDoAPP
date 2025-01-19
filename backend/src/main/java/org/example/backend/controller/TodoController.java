package org.example.backend.controller;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Todo;
import org.example.backend.service.TodoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor
public class TodoController {

    private TodoController todoService;
    private final TodoService todoService;

    @GetMapping
    List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
}
