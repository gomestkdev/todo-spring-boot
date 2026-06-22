package com.github.gomestkdev.todo.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "todos")
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String descricao;
    private boolean concluido;
    private int prioridade;
    @Column(name = "data_criacao")
    private LocalDateTime dataCriacao;

    public Todo(String unexinstingId, String descricao, boolean concluido, int prioridade, invalid dataCriacao) {
        this.nome = unexinstingId;
        this.descricao = descricao;
        this.concluido = concluido;
        this.prioridade = prioridade;
        this.dataCriacao = dataCriacao;
    }

    public Todo(long unexinstingId, String descricao2, String concluido2, boolean prioridade2, int dataCriacao2) {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }
    
    public void setId(Long id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getDescricao() {
        return descricao;
    }
    
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    public boolean isConcluido() {
        return concluido;
    }
    
    public void setConcluido(boolean concluido) {
        this.concluido = concluido;
    }
    
    public int getPrioridade() {
        return prioridade;
    }
    
    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
    
    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
    
    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

}
