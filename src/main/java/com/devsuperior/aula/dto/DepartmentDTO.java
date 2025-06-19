package com.devsuperior.aula.dto;

import com.devsuperior.aula.entities.Department;

public class DepartmentDTO {

    private long id;
    private String nome;

    public DepartmentDTO(long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public DepartmentDTO(Department entity) {
        id = entity.getId();
        nome = entity.getName();
    }

    public long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }
}
