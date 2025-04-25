package br.com.alura.codechella.config;

import br.com.alura.codechella.application.gateways.RepositorioUsuario;
import br.com.alura.codechella.application.usecases.CriarUsuario;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    CriarUsuario criarUsuario(RepositorioUsuario repositorioUsuario) {
        return new CriarUsuario(repositorioUsuario);
    }

}
