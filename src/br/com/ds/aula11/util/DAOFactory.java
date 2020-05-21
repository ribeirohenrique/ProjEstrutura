package br.com.ds.aula11.util;

import br.com.ds.aula11.modelo.dao.JDBCPessoaDAO;
import br.com.ds.aula11.modelo.dao.PessoaDAO;

public class DAOFactory {
	
	public static PessoaDAO createPessoaDAO() {
		return new JDBCPessoaDAO();
	}

}
