//Cadastra pessoas
package br.com.ds.aula11.test;

import br.com.ds.aula11.bean.Pessoa;
import br.com.ds.aula11.modelo.dao.PessoaDAO;
import br.com.ds.aula11.util.DAOFactory;

public class TestPessoaDAO {

	public static void main(String[] args) {

		Pessoa pessoa = new Pessoa();
		
		pessoa.setId(3);
		pessoa.setNome("Jorge");
		pessoa.setSobrenome("Aragão");
		pessoa.getEndereco().setBairro("Seumanézinho");
		pessoa.getEndereco().setCep("12345678");
		pessoa.getEndereco().setRua("Medico, 189");
		
		PessoaDAO pd = DAOFactory.createPessoaDAO();
		
		pd.salvar(pessoa);

	}

}
