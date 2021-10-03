package com.desafio.sonda.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.sonda.model.Aeronave;
import com.desafio.sonda.repository.AeronaveRepository;

@RestController
@RequestMapping("/aeronaves")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class AeronaveController {

	@Autowired
	private AeronaveRepository aeronaveRepository;

	// Consultar todas aeronaves
	@GetMapping
	public ResponseEntity<List<Aeronave>> getAll() {
		return ResponseEntity.ok(aeronaveRepository.findAll());
	}

	// Consultar por ID
	@GetMapping("/{id}")
	public ResponseEntity<Aeronave> getById(@PathVariable long id) {
		return aeronaveRepository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}

	// Consultar pelo nome
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Aeronave>> getByNome(@PathVariable String nome) {
		return ResponseEntity.ok(aeronaveRepository.findAllByNomeContainingIgnoreCase(nome));
	}

	// Consultar pela marca
	@GetMapping("/marca/{marca}")
	public ResponseEntity<List<Aeronave>> getByMarca(@PathVariable String marca) {
		return ResponseEntity.ok(aeronaveRepository.findAllByMarcaContainingIgnoreCase(marca));
	}

	// Consultar pela descrição
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<Aeronave>> getByDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(aeronaveRepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

	// Consultar aeronaves vendidas
	@GetMapping("/vendido/true")
	public ResponseEntity<List<Aeronave>> getVendidoTrue() {
		return ResponseEntity.ok(aeronaveRepository.findByVendidoTrue());
	}

	// Consultar aeronaves não vendidas
	@GetMapping("/vendido/false")
	public ResponseEntity<List<Aeronave>> getVendidoFalse() {
		return ResponseEntity.ok(aeronaveRepository.findByVendidoFalse());
	}

	// Cadastrar nova aeronave
	@PostMapping
	public ResponseEntity<Aeronave> postAeronave(@RequestBody Aeronave aeronave) {
		return ResponseEntity.status(HttpStatus.CREATED).body(aeronaveRepository.save(aeronave));
	}

	// Editar aeronave
	@PutMapping
	public ResponseEntity<Aeronave> putAeronave(@RequestBody Aeronave aeronave) {
		return ResponseEntity.status(HttpStatus.OK).body(aeronaveRepository.save(aeronave));
	}

	// Deletar aeronave
	@DeleteMapping("/{id}")
	public void deleteAeronave(@PathVariable long id) {
		aeronaveRepository.deleteById(id);
	}

}
