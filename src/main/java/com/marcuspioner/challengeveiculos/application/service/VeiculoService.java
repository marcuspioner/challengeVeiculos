package com.marcuspioner.challengeveiculos.application.service;

import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import com.marcuspioner.challengeveiculos.infrastructure.persistance.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository veiculoRepository;

    public Veiculo cadastrar(Veiculo veiculo) {
        return veiculoRepository.salvarVeiculo(veiculo);
    }

    public Veiculo editar(Long id, Veiculo veiculoDB) {
        Veiculo veiculo = veiculoRepository.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Cadastro de veículo não encontrado!"));

        veiculo.setAno(veiculoDB.getAno());
        veiculo.setCor(veiculoDB.getCor());
        veiculo.setMarca(veiculoDB.getMarca());
        veiculo.setModelo(veiculoDB.getModelo());
        veiculo.setPreco(veiculoDB.getPreco());

        return veiculoRepository.salvarVeiculo(veiculo);
    }

    public Veiculo buscarVeiculoPorId(Long id) {
        return veiculoRepository.buscarPorId(id).orElse(null);
    }

}
