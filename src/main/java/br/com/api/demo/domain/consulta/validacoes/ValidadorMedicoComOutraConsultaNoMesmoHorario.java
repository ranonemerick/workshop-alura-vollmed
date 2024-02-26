package br.com.api.demo.domain.consulta.validacoes;

import br.com.api.demo.domain.ValidacaoException;
import br.com.api.demo.domain.consulta.ConsultaRepository;
import br.com.api.demo.domain.consulta.DadosAgendamentoConsulta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ValidadorMedicoComOutraConsultaNoMesmoHorario implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var medicoPossuiConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());

        if(medicoPossuiConsultaNoMesmoHorario) {
            throw new ValidacaoException("Horário Indisponível");
        }

    }


}
