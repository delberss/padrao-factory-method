package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GestaoFutebolTecnicoTest {
    @Test
    void deveContratarTecnico() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Tecnico");
        assertEquals("Contratação de técnico confirmada", gestaoFutebol.contratar());
    }

    @Test
    void deveDemitirTecnico() {
        IGestaoFutebol gestaoFutebol = GestaoFutebolFactory.obterGestaoFutebol("Tecnico");
        assertEquals("Demissão de técnico confirmada", gestaoFutebol.demitir());
    }
}