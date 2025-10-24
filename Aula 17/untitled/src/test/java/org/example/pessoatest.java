package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class pessoatest {
    @Test
    void deveCriarPessoaCorretamente() {
        Pessoa p = new Pessoa("Ana", 25, "ana@email.com");

        assertEquals("Ana", p.getNome());
        assertEquals(25, p.getIdade());
        assertEquals("ana@email.com", p.getEmail());
    }

    @Test
    void deveAumentarIdadeAoFazerAniversario() {
        Pessoa p = new Pessoa("Carlos", 30, "carlos@email.com");

        p.fazerAniversario();

        assertEquals(31, p.getIdade());
    }

    @Test
    void naoDeveAceitarIdadeNegativa() {
        Pessoa p = new Pessoa();
        p.setIdade(-5);

        assertEquals(0, p.getIdade());
    }

    @Test
    void naoDeveAceitarEmailInvalido() {
        Pessoa p = new Pessoa();
        p.setEmail("emailInvalido");

        assertNull(p.getEmail());
    }
}

