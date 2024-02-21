package br.com.api.demo.endereco;

public record DadosEndereco(String logradouro,
                            String bairro,
                            String cep,
                            String cidade,
                            String uf,
                            String complemento,
                            String numero) {
}
