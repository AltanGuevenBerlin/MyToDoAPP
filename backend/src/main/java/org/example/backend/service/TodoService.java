package org.example.backend.service;

import lombok.RequiredArgsConstructor;
import org.example.backend.model.Todo;
import org.example.backend.repo.TodoRepo;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TodoService {

    private final TodoRepo todoRepo;

    public List(Todo) getAllTodos() {
        return todoRepo.findAll();
    }
}
