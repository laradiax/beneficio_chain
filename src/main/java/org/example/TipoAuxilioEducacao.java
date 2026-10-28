package org.example;

public class TipoAuxilioEducacao implements TipoBeneficio {

    private static TipoAuxilioEducacao tipoAuxilioEducacao =
            new TipoAuxilioEducacao();

    private TipoAuxilioEducacao() {};

    public static TipoAuxilioEducacao getTipoAuxilioEducacao() {
        return tipoAuxilioEducacao;
    }
}