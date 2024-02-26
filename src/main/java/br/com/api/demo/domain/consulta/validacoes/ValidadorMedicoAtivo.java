package br.com.api.demo.domain.consulta.validacoes;

import br.com.api.demo.domain.ValidacaoException;
import br.com.api.demo.domain.consulta.DadosAgendamentoConsulta;
import br.com.api.demo.domain.medico.MedicoRepository;

public class ValidadorMedicoAtivo implements ValidadorAgendamentoDeConsulta{

    private MedicoRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        if (dados.idMedico() == null) {
            return;
        }

        var medicoEstaAtivo = repository.findAtivoById(dados.idMedico());
        if(!medicoEstaAtivo) {
            throw new ValidacaoException("Medico não está disponível para consulta!");
        }
    }

}
