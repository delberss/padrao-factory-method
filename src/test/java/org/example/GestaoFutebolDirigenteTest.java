package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestaoFutebolDirigenteTest {
    @Test
    void deveContratarDirigente() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Dirigente");
        assertEquals("Contratação de dirigente confirmada", gestaoFutebol.contratar());
    }

    @Test
    void deveDemitirDirigente() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Dirigente");
        assertEquals("Demissão de dirigente confirmada", gestaoFutebol.demitir());
    }

}