package com.desafio.sonda.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.desafio.sonda.model.Aeronave;

@Repository
public interface AeronaveRepository extends JpaRepository<Aeronave, Long> {

	public List<Aeronave> findAllByNomeContainingIgnoreCase(String nome);

	public List<Aeronave> findAllByMarcaContainingIgnoreCase(String marca);

	public List<Aeronave> findAllByDescricaoContainingIgnoreCase(String descricao);

	public List<Aeronave> findByVendidoTrue();

	public List<Aeronave> findByVendidoFalse();

}
