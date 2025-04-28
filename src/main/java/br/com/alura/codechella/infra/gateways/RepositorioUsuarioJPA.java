package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.persistance.UsuarioRepository;
import br.com.alura.codechella.infra.persistance.UsuarioEntity;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class RepositorioUsuarioJPA implements RepositorioUsuario {

    private final UsuarioRepository repositorio;
    private final UsuarioEntityMapper mapper;

    public RepositorioUsuarioJPA(UsuarioRepository repositorio, UsuarioEntityMapper mapper) {
        this.repositorio = repositorio;
        this.mapper = mapper;
    }

    @Override
    public Usuario cadastrarUsuario(Usuario usuario) {
        UsuarioEntity entity = mapper.toEntity(usuario);
        repositorio.save(entity);
        return mapper.toDomain(entity);
    }

    @Override
    public List<Usuario> listarTodos() {
        return repositorio.findAll().stream().map(mapper::toDomain).collect(Collectors.toList());
    }
}
