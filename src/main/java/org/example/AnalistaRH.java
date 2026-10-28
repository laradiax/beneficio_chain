package org.example;

public class AnalistaRH extends ResponsavelBeneficio {

    public AnalistaRH(ResponsavelBeneficio superior) {
        listaBeneficios.add(
                TipoValeRefeicao.getTipoValeRefeicao());
        listaBeneficios.add(
                TipoValeTransporte.getTipoValeTransporte());

        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Analista de RH";
    }
}