package br.com.alura.codechella.application.usecases;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;

import java.util.List;

public class ListarUsuarios {

    private final RepositorioUsuario repositorio;

    public ListarUsuarios(RepositorioUsuario repositorio) {
        this.repositorio = repositorio;
    }

    public List<Usuario>  obterTodosUsuarios() {
        return this.repositorio.listarTodos();
    }
}
