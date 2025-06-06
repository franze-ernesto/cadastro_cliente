package br.com.projeto.bankpopular.interfaces.dto.output;

public record UsuarioResponseDTO(
        String nomeCompleto,
        String cpf,
        String email,
        String saldo

) {
}
