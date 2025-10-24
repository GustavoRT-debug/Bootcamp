package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class consultar {
    @BeforeAll
      static void conf(){
        banco.iniciarConexao();
    }
}
