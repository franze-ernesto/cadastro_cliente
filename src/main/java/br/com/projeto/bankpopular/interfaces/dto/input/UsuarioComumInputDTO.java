package br.com.projeto.bankpopular.interfaces.dto.input;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public record UsuarioComumInputDTO(
        @Column(name = "nome",unique = true)
        @NotBlank(message = "Nome não pode ser nulo")
        String nomeCompleto,

        @NotBlank(message = "Cpf não pode ser nulo")
        @Pattern(regexp = "\\d{11}", message = "CPF deve conter 11 dígitos numéricos")
        String cpf,

        @NotBlank(message = "Email é obrigatório")
        @Email(message = "Formato de e-mail inválido")
        String email,

        @Size(min = 6, max = 10)
        @NotBlank(message = "Senha é obrigatória")
        String senha
) {
}
