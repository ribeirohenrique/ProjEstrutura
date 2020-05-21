package br.com.ds.aula11.modelo.dao;

import java.util.List;

import br.com.ds.aula11.bean.Pessoa;

public interface PessoaDAO {
	
	public void salvar(Pessoa pessoa);
	public void excluir(int id);
	public List<Pessoa> listar();
	public void atualizar(Pessoa pessoa);
	public Pessoa buscar (int id);

}
