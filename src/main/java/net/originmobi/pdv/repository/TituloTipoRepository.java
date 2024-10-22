package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.TituloTipo;
@Repository
public interface TituloTipoRepository extends JpaRepository<TituloTipo, Long>{

}
