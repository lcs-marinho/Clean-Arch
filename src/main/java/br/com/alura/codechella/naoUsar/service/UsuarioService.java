package br.com.alura.codechella.naoUsar.service;

import br.com.alura.codechella.infra.persistance.UsuarioEntity;

import java.util.List;

public interface UsuarioService {
    UsuarioEntity cadastrarUsuario(UsuarioEntity usuarioEntity);

    List<UsuarioEntity> listarTodos();
}
