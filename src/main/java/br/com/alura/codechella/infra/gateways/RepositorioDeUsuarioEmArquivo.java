package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeUsuarioEmArquivo implements RepositorioUsuario {
    List<Usuario> usuarios = new ArrayList<>();

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        this.usuarios.add(usuario);
        return usuario;
    }

    @Override
    public List<Usuario> listarTodos() {
        return this.usuarios;
    }


}