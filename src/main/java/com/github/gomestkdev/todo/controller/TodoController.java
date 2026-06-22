package com.github.gomestkdev.todo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.gomestkdev.todo.entity.Todo;
import com.github.gomestkdev.todo.service.TodoService;


@RestController
@RequestMapping("/api/v1/todos")
public class TodoController {
    private final TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }

    @PostMapping
    public List<Todo> create(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }
    
    @PutMapping("/{id}")
    public List<Todo> update(@PathVariable("id") Long id, @RequestBody Todo todo) {
        todo.setId(id);
        return todoService.updateTodo(todo);
    }

    @DeleteMapping("/{id}")
    public List<Todo> delete(@PathVariable("id") Long id) {
        return todoService.deleteTodo(id);
    }
}
