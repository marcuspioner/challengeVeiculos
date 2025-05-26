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
    private VeiculoSdRepository jpa;

    @Override
    public Veiculo salvarVeiculo(Veiculo veiculo) {
        return jpa.save(veiculo);
    }

    @Override
    public Optional<Veiculo> buscarVeiculoPorId(Long id) {
        return jpa.findById(id);
    }

    @Override
    public List<Veiculo> listarVeiculosAVendaPorPreco() {
        return jpa.findByVendidoFalseOrderByPrecoAsc();
    }

    @Override
    public List<Veiculo> listarVeiculosVendidosPorPreco() {
        return jpa.findByVendidoTrueOrderByPrecoAsc();
    }
}
