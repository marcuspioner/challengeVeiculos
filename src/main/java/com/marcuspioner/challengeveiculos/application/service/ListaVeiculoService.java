package com.marcuspioner.challengeveiculos.application.service;

import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import com.marcuspioner.challengeveiculos.infrastructure.persistance.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListaVeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public List<Veiculo> listarVeiculosAVendaPorPreco() {
        return veiculoRepository.listarVeiculosAVendaPorPreco();
    }

    public List<Veiculo> listarVeiculosVendidosPorPreco() {
        return veiculoRepository.listarVeiculosVendidosPorPreco();
    }
}
