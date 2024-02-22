package br.com.api.demo.domain.paciente;

import br.com.api.demo.domain.endereco.Endereco;

public record DadosDetalhamentoPaciente(Long id, String nome, String cpf, String email, String telefone, Endereco endereco) {

    public DadosDetalhamentoPaciente(Paciente paciente){
        this(paciente.getId(),paciente.getNome(), paciente.getCpf(), paciente.getEmail(), paciente.getTelefone(), paciente.getEndereco());
    }

}
