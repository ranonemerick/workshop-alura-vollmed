package br.com.api.demo.paciente;

public record DadosListagemPaciente(String nome, String email, String telefone) {

    public DadosListagemPaciente(Paciente paciente){
        this(paciente.getNome(), paciente.getEmail(), paciente.getTelefone());
    }

}
