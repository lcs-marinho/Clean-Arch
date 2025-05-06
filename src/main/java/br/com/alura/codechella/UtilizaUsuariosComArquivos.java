package br.com.alura.codechella;

import br.com.alura.codechella.domain.entities.Usuario;
import br.com.alura.codechella.infra.gateways.RepositorioDeUsuarioEmArquivo;

import java.time.LocalDate;

public class UtilizaUsuariosComArquivos {

    public static void main(String[] args) {
        RepositorioDeUsuarioEmArquivo repositorioDeUsuarioEmArquivo = new RepositorioDeUsuarioEmArquivo();

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(
                new Usuario("090.451.578-00", "Chico", LocalDate.parse("2000-10" +
                        "-24"), "chico@gmail.com"
                ));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(
                new Usuario("090.451.578-00", "Jurema", LocalDate.parse("2000-10" +
                        "-24"), "maria@gmail.com"
                ));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(
                new Usuario("090.451.578-00", "Raimunda", LocalDate.parse("2000-10" +
                        "-24"), "raimunda@gmail.com"
                ));

        repositorioDeUsuarioEmArquivo.cadastrarUsuario(
                new Usuario("090.451.578-00", "Sivirino", LocalDate.parse("2000-10" +
                        "-24"), "sivirino@gmail.com"
                ));

//        System.out.println(repositorioDeUsuarioEmArquivo.listarTodos());

        repositorioDeUsuarioEmArquivo.gravaEmArquivo("usuario.txt");
    }

}
