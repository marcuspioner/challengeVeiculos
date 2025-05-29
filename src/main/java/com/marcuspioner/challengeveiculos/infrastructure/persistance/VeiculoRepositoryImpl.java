package com.marcuspioner.challengeveiculos.infrastructure.persistance;

import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import com.marcuspioner.challengeveiculos.infrastructure.persistance.repository.VeiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class VeiculoRepositoryImpl implements VeiculoRepository {

    @Autowired
    private VeiculoSdRepository veiculoSdRepository;

    @Override
    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return veiculoSdRepository.save(veiculo);
    }

    @Override
    public Optional<Veiculo> buscarPorId(Long id) {
        return veiculoSdRepository.findById(id);
    }

    @Override
    public List<Veiculo> listarVeiculosAVendaPorPreco() {
        return veiculoSdRepository.findByVendidoFalseOrderByPrecoAsc();
    }

    @Override
    public List<Veiculo> listarVeiculosVendidosPorPreco() {
        return veiculoSdRepository.findByVendidoTrueOrderByPrecoAsc();
    }
}

