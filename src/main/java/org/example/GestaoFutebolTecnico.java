package org.example;

public class GestaoFutebolTecnico implements IGestaoFutebol {
    @Override
    public String contratar() {
        return "Contratação de técnico confirmada";

    }

    @Override
    public String demitir() {
        return "Demissão de técnico confirmada";
    }
}
