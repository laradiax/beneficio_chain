package org.example;

public class GerenteRH extends ResponsavelBeneficio {

    public GerenteRH(ResponsavelBeneficio superior) {
        listaBeneficios.add(
                TipoPrevidenciaPrivada.getTipoPrevidenciaPrivada());

        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Gerente de RH";
    }
}