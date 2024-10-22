package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.PagarTipo;
@Repository
public interface PagarTipoRepository extends JpaRepository<PagarTipo, Long> {

}
