package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestaoFutebolJogadorTest {
    @Test
    void deveContratarJogador() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Jogador");
        assertEquals("Contratação de jogador confirmada", gestaoFutebol.contratar());
    }

    @Test
    void deveDemitirJogador() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Jogador");
        assertEquals("Demissão de jogador confirmada", gestaoFutebol.demitir());
    }
}