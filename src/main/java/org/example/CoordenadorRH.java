package org.example;

public class CoordenadorRH extends ResponsavelBeneficio {

    public CoordenadorRH(ResponsavelBeneficio superior) {
        listaBeneficios.add(
                TipoPlanoSaude.getTipoPlanoSaude());

        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Coordenador de RH";
    }
}