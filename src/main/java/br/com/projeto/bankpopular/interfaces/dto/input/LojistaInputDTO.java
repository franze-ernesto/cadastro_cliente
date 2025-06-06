package br.com.projeto.bankpopular.interfaces.dto.input;

import jakarta.persistence.Column;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public record LojistaInputDTO(

        @Column(name = "nome_loja",unique = true, nullable = false)
        @NotBlank(message = "Nome não pode ser nulo")
        String razaoSocial,

        @NotBlank(message = "Cpf não pode ser nulo")
        @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos numéricos")
        String cnpj
) {
}
