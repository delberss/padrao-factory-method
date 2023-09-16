package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestaoFutebolFactoryTest {
    @Test
    void deveRetornarExcecaoParaServicoInexistente() {
        try {
            IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Juiz");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Gestão de futebol inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaServicoInvalido() {
        try {
            IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Goleiro");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Gestão de futebol inválido", e.getMessage());
        }
    }
}