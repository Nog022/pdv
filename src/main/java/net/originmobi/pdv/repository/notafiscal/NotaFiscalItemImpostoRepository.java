package net.originmobi.pdv.repository.notafiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.NotaFiscalItemImposto;
@Repository
public interface NotaFiscalItemImpostoRepository extends JpaRepository<NotaFiscalItemImposto, Long> {

}
