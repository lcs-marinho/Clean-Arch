package br.com.alura.codechella.domain.entities;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

public class UsuarioTest {
    @Test
    public void naoDeveCadastrarUsuarioComCPFInvalido() {
        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("0000000000","Lucas Marinho", LocalDate.parse("1997-02-28"), "email@email"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("123","Lucas Marinho", LocalDate.parse("1997-02-28"), "email@email"));

        Assertions.assertThrows(IllegalArgumentException.class,
                () -> new Usuario("5-123","Lucas Marinho", LocalDate.parse("1997-02-28"), "23"));
    }

    @Test
    public void deveCriarUsuarioUsandoFabricaUsuario() {
        FabricaUsuario fabricaUsuario = new FabricaUsuario();
        Usuario usuario = fabricaUsuario.comNomeCpfNascimento("Larissa", "111.456.481-00", LocalDate.parse("2002-03-11"));

        Assertions.assertEquals( "Larissa", usuario.getNome());

        usuario = fabricaUsuario.incluiEndereco("59147-150",159,"Rua das Dores");

        Assertions.assertEquals("Rua das Dores", usuario.getEndereco().getComplemento());
        Assertions.assertEquals(159, usuario.getEndereco().getNumero());
    }


}
