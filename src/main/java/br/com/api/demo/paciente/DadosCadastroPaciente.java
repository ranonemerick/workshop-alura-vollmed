package br.com.api.demo.paciente;

import br.com.api.demo.endereco.DadosEndereco;
import br.com.api.demo.endereco.Endereco;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosCadastroPaciente(
        @NotBlank
        String nome,

        @NotBlank
        @Pattern(regexp = "\\d{11}")
        String cpf,

        @NotBlank
        @Email
        String email,

        @NotBlank
        String telefone,

        @NotNull
        @Valid
        DadosEndereco endereco) {
}
