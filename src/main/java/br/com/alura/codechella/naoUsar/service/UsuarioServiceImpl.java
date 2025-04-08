package br.com.alura.codechella.naoUsar.service;

import br.com.alura.codechella.infra.persistance.UsuarioEntity;
import br.com.alura.codechella.infra.persistance.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {
    @Autowired
    private UsuarioRepository repository;

    @Override
    public UsuarioEntity cadastrarUsuario(UsuarioEntity usuarioEntity) {
        return repository.save(usuarioEntity);
    }

    @Override
    public List<UsuarioEntity> listarTodos() {
        return repository.findAll();
    }
}
