package net.originmobi.pdv.repository.notafiscal;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.FreteTipo;
@Repository
public interface FreteTipoRepository extends JpaRepository<FreteTipo, Long> {

}
