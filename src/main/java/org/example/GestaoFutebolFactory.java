package org.example;

public class GestaoFutebolFactory {
    public static IGestaoFutebol obterGestaoFutebol(String gestao) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("org.example.GestaoFutebol" + gestao);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Gestão de futebol inexistente");
        }
        if (!(objeto instanceof IGestaoFutebol)) {
            throw new IllegalArgumentException("Gestão de futebol inválido");
        }
        return (IGestaoFutebol) objeto;
    }
}
