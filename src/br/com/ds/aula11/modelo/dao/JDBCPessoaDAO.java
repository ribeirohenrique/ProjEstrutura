package br.com.ds.aula11.modelo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.management.RuntimeErrorException;

import br.com.ds.aula11.bean.Pessoa;
import br.com.ds.aula11.util.ConnectionFactory;

//Esta classe implementa diretamente com o banco as informaçoes passadas por query
public class JDBCPessoaDAO implements PessoaDAO{
	
	Connection connection;
	
	public JDBCPessoaDAO() {
		connection = ConnectionFactory.getConnection();
	}

	@Override
	public void salvar(Pessoa pessoa) {
		
		String sql = "INSERT INTO TB_PESSOA "
				   + "(ID, NOME, SOBRENOME, BAIRRO, CEP, RUA)"
				   + "VALUES (?,?,?,?,?,?)";
		
	try {
		PreparedStatement ps = connection.prepareStatement(sql);
		
		ps.setInt(1,  pessoa.getId());
		ps.setString(2, pessoa.getNome());
		ps.setString(3, pessoa.getSobrenome());
		ps.setString(4, pessoa.getEndereco().getBairro());
		ps.setString(5, pessoa.getEndereco().getCep());
		ps.setString(6, pessoa.getEndereco().getRua());
		
		ps.executeUpdate();
		
		ps.close();
	}
	
	catch (SQLException ex) {
		Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
		throw new RuntimeErrorException(null, "Erro ao salvar a Pessoa (Bean)");
	}
	}

	@Override
	public void excluir(int id) {
		try {			
			String sql = "DELETE FROM TB_PESSOA WHERE ID = ?";
			PreparedStatement ps = connection.prepareStatement(sql);
			ps.setInt(1, id);
			ps.executeUpdate();
			ps.close();
			
		} catch (SQLException ex){
			Logger.getLogger(JDBCPessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
			throw new RuntimeErrorException(null, "Erro ao excluir a Pessoa (Bean)");
		}
		
	}

	@Override
	public List<Pessoa> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void atualizar(Pessoa pessoa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Pessoa buscar(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
