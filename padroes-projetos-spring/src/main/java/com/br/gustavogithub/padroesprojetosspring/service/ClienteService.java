package com.br.gustavogithub.padroesprojetosspring.service;

import com.br.gustavogithub.padroesprojetosspring.model.Cliente;

public interface ClienteService {

	Iterable<Cliente> buscartodos();
	Cliente buscarPorId(Long id);
	void inserir(Cliente cliente);
	void atualizar(Long id, Cliente cliente);
	void deletar(Long id);
}
