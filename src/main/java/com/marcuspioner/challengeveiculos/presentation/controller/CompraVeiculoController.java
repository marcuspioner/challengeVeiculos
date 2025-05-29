package com.marcuspioner.challengeveiculos.presentation.controller;

import com.marcuspioner.challengeveiculos.application.service.VeiculoService;
import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/veiculos")
public class CompraVeiculoController {

    @Autowired
    private VeiculoService veiculoService;


    @PostMapping("/comprar/{id}")
    public ResponseEntity<String> comprar(@PathVariable Long id) {

        Veiculo veiculo = veiculoService.buscarVeiculoPorId(id);

        if (Objects.isNull(veiculo)) {
            return ResponseEntity.notFound().build();
        }

        veiculo.setVendido(true);
        veiculoService.cadastrar(veiculo);

        return ResponseEntity.ok("Parabéns, compra realizada com sucesso!");
    }
}
