package com.github.gomestkdev.todo.service;

import java.util.List;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.github.gomestkdev.todo.entity.Todo;
import com.github.gomestkdev.todo.repository.TodoRepository;

@Service
public class TodoService {
    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> getAllTodos() {
        // Lógica para obter todos os todos
        Sort sort = Sort.by(
            Sort.Order.desc("prioridade"),
            Sort.Order.asc("nome")
        );

        return todoRepository.findAll(sort);
    }

    public List<Todo> createTodo(Todo todo) {
        // Lógica para criar um novo todo
        todoRepository.save(todo);
        return getAllTodos();
    }

    public List<Todo> updateTodo(Todo todo) {
        // Lógica para atualizar um todo existente
        todoRepository.save(todo);

        return getAllTodos();
    }

    public List<Todo> deleteTodo(Long id) {
        // Lógica para deletar um todo
        todoRepository.deleteById(id);
        return getAllTodos();
    }
}
