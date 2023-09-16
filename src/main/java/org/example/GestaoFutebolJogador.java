package org.example;

public class GestaoFutebolJogador implements IGestaoFutebol{
    @Override
    public String contratar() {
        return "Contratação de jogador confirmada";

    }

    @Override
    public String demitir() {
        return "Demissão de jogador confirmada";
    }
}
