package br.com.projeto.bankpopular.domain.repository;

import br.com.projeto.bankpopular.domain.model.UsuarioComum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsuarioComumRepository extends JpaRepository<UsuarioComum, Long> {

    Optional<UsuarioComum> findByEmail(String email);
    Optional<UsuarioComum> findByCpf(String cpf);
}
