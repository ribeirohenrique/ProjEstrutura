package br.com.ds.aula11.test;

import br.com.ds.aula11.util.ConnectionFactory;

//rodar como java application
public class TestConnection {
	
	public static void main(String[] args) {
		
		ConnectionFactory.getConnection();
		System.out.println("Banco Conectado");
		
	}

}
