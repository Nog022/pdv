package net.originmobi.pdv.repository.notafiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.NotaFiscalFinalidade;
@Repository
public interface NotaFiscalFinalidadeRepository extends JpaRepository<NotaFiscalFinalidade, Long> {

}
