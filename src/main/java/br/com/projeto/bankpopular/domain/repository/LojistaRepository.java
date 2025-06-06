package br.com.projeto.bankpopular.domain.repository;

import br.com.projeto.bankpopular.domain.model.Lojista;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LojistaRepository extends JpaRepository<Lojista, Long> {
    Optional<Lojista> findByEmail(String email);
    Optional<Lojista> findByCnpj(String cnpj);
}
