package com.marcuspioner.challengeveiculos.infrastructure.persistance.repository;

import com.marcuspioner.challengeveiculos.domain.model.Veiculo;

import java.util.List;
import java.util.Optional;

public interface VeiculoRepository {

    Veiculo salvarVeiculo(Veiculo veiculo);

    Optional<Veiculo> buscarVeiculoPorId(Long id);

    List<Veiculo> listarVeiculosAVendaPorPreco();

    List<Veiculo> listarVeiculosVendidosPorPreco();

}

