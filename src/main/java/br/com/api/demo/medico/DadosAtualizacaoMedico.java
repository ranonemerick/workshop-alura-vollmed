package br.com.api.demo.medico;

import br.com.api.demo.endereco.DadosEndereco;
import br.com.api.demo.endereco.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
