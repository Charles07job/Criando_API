package br.com.AnaBatista.api.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.AnaBatista.api.model.UsuarioModel;

public interface UsuarioRepository extends CrudRepository <UsuarioModel, Integer> {
	

}
