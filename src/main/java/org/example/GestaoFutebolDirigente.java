package org.example;

public class GestaoFutebolDirigente implements IGestaoFutebol {
    @Override
    public String contratar() {
        return "Contratação de dirigente confirmada";
    }

    @Override
    public String demitir() {
        return "Demissão de dirigente confirmada";
    }
}
