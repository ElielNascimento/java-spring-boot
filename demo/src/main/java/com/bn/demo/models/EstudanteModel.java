package com.bn.demo.models;

import com.bn.demo.enums.EstudanteEnum;
import jakarta.persistence.*;

@Entity
@Table(name = "TBL_PESSOA")
public class EstudanteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    private EstudanteEnum estudanteEnum;

    public EstudanteModel(){
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

    public EstudanteEnum getEstudanteEnum() {
        return estudanteEnum;
    }

    public void setEstudanteEnum(EstudanteEnum estudanteEnum) {
        this.estudanteEnum = estudanteEnum;
    }
}
