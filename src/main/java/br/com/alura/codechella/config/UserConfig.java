package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import br.com.alura.codechella.application.usecases.ListarUsuarios;
import br.com.alura.codechella.infra.gateways.RepositorioUsuarioJPA;
import br.com.alura.codechella.infra.gateways.UsuarioEntityMapper;
import br.com.alura.codechella.infra.persistance.UsuarioRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioUsuario repositorioUsuario) {
        return new CriarUsuario(repositorioUsuario);
    }

    @Bean
    ListarUsuarios listarUsuarios(RepositorioUsuario repositorioUsuario) {
        return new ListarUsuarios(repositorioUsuario);
    }

    @Bean
    RepositorioUsuarioJPA criarRepositorioJpa(UsuarioRepository repository, UsuarioEntityMapper mapper) {
        return new RepositorioUsuarioJPA(repository,mapper);
    }

    @Bean
    UsuarioEntityMapper retornaMapper() {
        return new UsuarioEntityMapper();
    }

    


}
