package br.com.alura.codechella.application.gateways;

import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.persistance.UsuarioEntity;

import java.util.List;

public interface RepositorioUsuario {

    Usuario cadastrarUsuario(Usuario usuario);

    List<Usuario> listarTodos();
}
