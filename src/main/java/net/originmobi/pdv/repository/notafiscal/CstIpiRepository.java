package net.originmobi.pdv.repository.notafiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.CstIPI;
@Repository
public interface CstIpiRepository extends JpaRepository<CstIPI, Long>{

}
