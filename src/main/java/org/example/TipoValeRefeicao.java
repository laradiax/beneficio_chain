package org.example;

public class TipoValeRefeicao implements TipoBeneficio {

    private static TipoValeRefeicao tipoValeRefeicao =
            new TipoValeRefeicao();

    private TipoValeRefeicao() {};

    public static TipoValeRefeicao getTipoValeRefeicao() {
        return tipoValeRefeicao;
    }
}