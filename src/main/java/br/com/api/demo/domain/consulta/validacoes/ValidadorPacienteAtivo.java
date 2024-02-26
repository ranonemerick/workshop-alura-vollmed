package br.com.api.demo.domain.consulta.validacoes;

import br.com.api.demo.domain.ValidacaoException;
import br.com.api.demo.domain.consulta.DadosAgendamentoConsulta;
import br.com.api.demo.domain.medico.MedicoRepository;
import br.com.api.demo.domain.paciente.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class ValidadorPacienteAtivo implements ValidadorAgendamentoDeConsulta{

    @Autowired
    private PacienteRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var pacienteEstaAtivo = repository.findAtivoById(dados.idPaciente());
        if(!pacienteEstaAtivo) {
            throw new ValidacaoException("Paciente não está autorizado para realizar consulta!");
        }
    }
}
