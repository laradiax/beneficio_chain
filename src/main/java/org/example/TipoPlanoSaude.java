package org.example;

public class TipoPlanoSaude implements TipoBeneficio {

    private static TipoPlanoSaude tipoPlanoSaude =
            new TipoPlanoSaude();

    private TipoPlanoSaude() {};

    public static TipoPlanoSaude getTipoPlanoSaude() {
        return tipoPlanoSaude;
    }
}