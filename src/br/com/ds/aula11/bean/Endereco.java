//no bean só temos o construtor, os atributos e getters and setters
package br.com.ds.aula11.bean;

public class Endereco {
	
	private String rua;
	private String bairro;
	private String cep;
	
	public Endereco() {
		rua = "";
		bairro = "";
		cep = "";
	}

	
	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
