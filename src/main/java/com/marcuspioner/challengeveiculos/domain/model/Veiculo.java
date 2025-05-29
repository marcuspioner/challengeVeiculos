package com.marcuspioner.challengeveiculos.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
public class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer ano;
    private String cor;
    private String marca;
    private String modelo;
    private BigDecimal preco;
    private Boolean vendido;

    public Veiculo() {

    }

    public Veiculo(Long id, Integer ano, String cor, String marca, String modelo, BigDecimal preco, Boolean vendido) {
        this.id = id;
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.vendido = vendido;
    }

}
