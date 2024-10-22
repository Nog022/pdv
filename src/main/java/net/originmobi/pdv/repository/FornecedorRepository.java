package net.originmobi.pdv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Fornecedor;
@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Long> {

	public List<Fornecedor> findByNomeContaining(String nome);

	public Fornecedor findByCnpjIn(String cnpj);

	public Fornecedor findByCodigoIn(Long codigo);

}
