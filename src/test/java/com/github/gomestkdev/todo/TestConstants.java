package com.github.gomestkdev.todo;

import java.util.ArrayList;
import java.util.List;

import com.github.gomestkdev.todo.entity.Todo;

public class TestConstants {
  public static final List<Todo> TODOS = new ArrayList<>() {
    {
      add(new Todo(9995L, "@josegomes", "Curtir", false, 1));
      add(new Todo(9996L, "@josegomes", "Comentar", false, 1));
      add(new Todo(9997L, "@josegomes", "Compartilhar", false, 1));
      add(new Todo(9998L, "@josegomes", "Se Inscrever", false, 1));
      add(new Todo(9999L, "@josegomes", "Ativar as Notificações", false, 1));
    }
  };

  public static final Todo TODO = TODOS.get(0);
}