package org.example;

public class TipoPrevidenciaPrivada implements TipoBeneficio {

    private static TipoPrevidenciaPrivada tipoPrevidenciaPrivada =
            new TipoPrevidenciaPrivada();

    private TipoPrevidenciaPrivada() {};

    public static TipoPrevidenciaPrivada getTipoPrevidenciaPrivada() {
        return tipoPrevidenciaPrivada;
    }
}