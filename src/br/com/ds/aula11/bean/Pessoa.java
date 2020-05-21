//no bean só temos o construtor, os atributos e getters and setters
package br.com.ds.aula11.bean;

import br.com.ds.aula11.bean.Endereco;

public class Pessoa {
	
	private int id;
	private String nome;
	private String sobrenome;
	private Endereco endereco;
	
	public Pessoa() {
		nome = "";
		sobrenome = "";
		endereco = new Endereco();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/**
	* @return nome
	*/
	public String getNome() {
		return nome;
	}

	/**
	* @param sobrenome
	*/
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
   /**
    * @return sobrenome
    */
	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
}
