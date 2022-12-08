package service;

import model.Cliente;

/*
 * Interface que define o padrão <b>Strategy</b> no dominio  de cliente.
 * Com isso, se necessário, podemor multiplas implementações dessa mesma 
 * interface.
 * 
 * 
 */

public interface ClienteService {

	Iterable<Cliente> buscarTodos();

	Cliente buscarPorId(Long id);

	void inserir(Cliente cliente);

	void atualizar(Long id, Cliente cliente);

	void deletar(Long id);

}