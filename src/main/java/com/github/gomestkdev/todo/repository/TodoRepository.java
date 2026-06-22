package com.github.gomestkdev.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.github.gomestkdev.todo.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
