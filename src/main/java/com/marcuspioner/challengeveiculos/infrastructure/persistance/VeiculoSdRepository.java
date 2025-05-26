package com.marcuspioner.challengeveiculos.infrastructure.persistance;

import com.marcuspioner.challengeveiculos.domain.model.Veiculo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface VeiculoSdRepository extends JpaRepository<Veiculo, Long> {

    List<Veiculo> findByVendidoFalseOrderByPrecoAsc();

    List<Veiculo> findByVendidoTrueOrderByPrecoAsc();
}
