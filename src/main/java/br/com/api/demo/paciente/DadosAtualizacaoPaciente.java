package br.com.api.demo.paciente;

import br.com.api.demo.endereco.DadosEndereco;
import br.com.api.demo.endereco.Endereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String email, String telefone, DadosEndereco endereco) {
}
