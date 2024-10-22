package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.PagamentoTipo;
@Repository
public interface PagamentoTipoRespository extends JpaRepository<PagamentoTipo, Long> {

	public PagamentoTipo findByCodigoIn(Long codigo);

	@Query("select pt.qtd_parcelas from PagamentoTipo pt where pt.codigo = ?1")
	public String quantidadeParcelar(Long codigo);
}
