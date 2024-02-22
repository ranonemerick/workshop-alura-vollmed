package br.com.api.demo.domain.paciente;

import br.com.api.demo.domain.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoPaciente(@NotNull Long id, String nome, String email, String telefone, DadosEndereco endereco) {
}
