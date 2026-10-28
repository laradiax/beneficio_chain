package org.example;

import java.util.ArrayList;

public abstract class ResponsavelBeneficio {

    protected ArrayList<TipoBeneficio> listaBeneficios =
            new ArrayList<TipoBeneficio>();

    private ResponsavelBeneficio responsavelSuperior;

    public ResponsavelBeneficio getResponsavelSuperior() {
        return responsavelSuperior;
    }

    public void setResponsavelSuperior(
            ResponsavelBeneficio responsavelSuperior) {
        this.responsavelSuperior = responsavelSuperior;
    }

    public abstract String getDescricaoCargo();

    public String analisarSolicitacao(
            SolicitacaoBeneficio solicitacao) {

        if (listaBeneficios.contains(solicitacao.getTipoBeneficio())) {
            return getDescricaoCargo();
        } else {
            if (responsavelSuperior != null) {
                return responsavelSuperior.analisarSolicitacao(solicitacao);
            } else {
                return "Sem aprovação";
            }
        }
    }
}