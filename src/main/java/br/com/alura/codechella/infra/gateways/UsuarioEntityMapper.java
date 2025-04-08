package br.com.alura.codechella.infra.gateways;

import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.persistance.UsuarioEntity;

public class UsuarioEntityMapper {

    public UsuarioEntity toEntity(Usuario usuario) {
        return new UsuarioEntity(usuario.getCpf(),usuario.getNome(),usuario.getNascimento(),usuario.getEmail());
    }

    public Usuario toDomain(UsuarioEntity usuarioEntity) {
        return new Usuario(usuarioEntity.getCpf(), usuarioEntity.getNome(),usuarioEntity.getNascimento(), usuarioEntity.getEmail());
    }

}
