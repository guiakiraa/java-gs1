package br.com.fiap.gs.repository;

import br.com.fiap.gs.model.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EnderecoRepository extends JpaRepository<Endereco, Long> {
}
