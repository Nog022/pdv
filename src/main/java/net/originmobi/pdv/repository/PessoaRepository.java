package net.originmobi.pdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Pessoa;
@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long> {

	public Pessoa findByCpfcnpjContaining(String cpfcnpj);

	public List<Pessoa> findByNomeContaining(String nome);

	public Pessoa findByCodigoIn(Long codigo);

}
