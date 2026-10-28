package org.example;

public class DiretorRH extends ResponsavelBeneficio {

    public DiretorRH(ResponsavelBeneficio superior) {
        listaBeneficios.add(
                TipoAuxilioEducacao.getTipoAuxilioEducacao());

        setResponsavelSuperior(superior);
    }

    public String getDescricaoCargo() {
        return "Diretor de RH";
    }
}