package com.desafio.sonda.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_aeronaves")
public class Aeronave {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotNull(message = "O atributo nome é obrigatório!")
	@Size(min = 2, max = 50, message = "O atributo nome deve ter no mínimo 2 e no máximo 50 caracteres")
	private String nome;

	@NotNull(message = "O atributo marca é obrigatório!")
	@Size(min = 2, max = 50, message = "O atributo marca deve ter no mínimo 2 e no máximo 50 caracteres")
	private String marca;

	private Integer ano;

	@NotNull(message = "O atributo descricao é obrigatório!")
	@Size(min = 2, max = 1000, message = "O atributo descricao deve ter no mínimo 2 e no máximo 1000 caracteres")
	private String descricao;

	private Boolean vendido;

	private String foto;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getVendido() {
		return vendido;
	}

	public void setVendido(Boolean vendido) {
		this.vendido = vendido;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

}
