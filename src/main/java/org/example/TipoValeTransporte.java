package org.example;

public class TipoValeTransporte implements TipoBeneficio {

    private static TipoValeTransporte tipoValeTransporte =
            new TipoValeTransporte();

    private TipoValeTransporte() {};

    public static TipoValeTransporte getTipoValeTransporte() {
        return tipoValeTransporte;
    }
}