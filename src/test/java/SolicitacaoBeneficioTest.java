import org.example.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolicitacaoBeneficioTest {

    ResponsavelBeneficio analista;
    ResponsavelBeneficio coordenador;
    ResponsavelBeneficio gerente;
    ResponsavelBeneficio diretor;

    @BeforeEach
    void setUp() {
        diretor = new DiretorRH(null);
        gerente = new GerenteRH(diretor);
        coordenador = new CoordenadorRH(gerente);
        analista = new AnalistaRH(coordenador);
    }

    @Test
    void deveRetornarAnalistaParaValeRefeicao() {
        assertEquals(
                "Analista de RH",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                TipoValeRefeicao.getTipoValeRefeicao()))
        );
    }

    @Test
    void deveRetornarAnalistaParaValeTransporte() {
        assertEquals(
                "Analista de RH",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                TipoValeTransporte.getTipoValeTransporte()))
        );
    }

    @Test
    void deveRetornarCoordenadorParaPlanoSaude() {
        assertEquals(
                "Coordenador de RH",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                TipoPlanoSaude.getTipoPlanoSaude()))
        );
    }

    @Test
    void deveRetornarGerenteParaPrevidenciaPrivada() {
        assertEquals(
                "Gerente de RH",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                TipoPrevidenciaPrivada
                                        .getTipoPrevidenciaPrivada()))
        );
    }

    @Test
    void deveRetornarDiretorParaAuxilioEducacao() {
        assertEquals(
                "Diretor de RH",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                TipoAuxilioEducacao.getTipoAuxilioEducacao()))
        );
    }

    @Test
    void deveRetornarSemAprovacaoParaBeneficioNaoTratado() {
        assertEquals(
                "Sem aprovação",
                analista.analisarSolicitacao(
                        new SolicitacaoBeneficio(
                                "Maria",
                                null))
        );
    }
}