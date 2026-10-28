package org.example;

public class SolicitacaoBeneficio {

    private String nomeFuncionario;
    private TipoBeneficio tipoBeneficio;

    public SolicitacaoBeneficio(
            String nomeFuncionario,
            TipoBeneficio tipoBeneficio) {
        this.nomeFuncionario = nomeFuncionario;
        this.tipoBeneficio = tipoBeneficio;
    }

    public String getNomeFuncionario() {
        return nomeFuncionario;
    }

    public void setNomeFuncionario(String nomeFuncionario) {
        this.nomeFuncionario = nomeFuncionario;
    }

    public TipoBeneficio getTipoBeneficio() {
        return tipoBeneficio;
    }

    public void setTipoBeneficio(TipoBeneficio tipoBeneficio) {
        this.tipoBeneficio = tipoBeneficio;
    }
}