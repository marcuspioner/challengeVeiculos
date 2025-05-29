package com.marcuspioner.challengeveiculos.presentation.controller;

import com.marcuspioner.challengeveiculos.application.service.ListaVeiculoService;
import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/veiculos")
public class ListaVeiculoController {

    @Autowired
    private ListaVeiculoService listaVeiculoService;

    @Operation(
            summary = "Listar veículos à venda",
            description = "Busca uma lista de veículos cadastrados que estão à venda."
    )
    @GetMapping("/listaVeiculosAVenda")
    public ResponseEntity<List<Veiculo>> listaVeiculosAVenda() {
        return ResponseEntity.ok(listaVeiculoService.listarVeiculosAVendaPorPreco());
    }

    @Operation(
            summary = "Listar veículos vendidos",
            description = "Busca uma lista de veículos cadastrados que estão vendidos."
    )
    @GetMapping("/listaVeiculosVendidos")
    public ResponseEntity<List<Veiculo>> listaVeiculosVendidos() {
        return ResponseEntity.ok(listaVeiculoService.listarVeiculosVendidosPorPreco());
    }
}
