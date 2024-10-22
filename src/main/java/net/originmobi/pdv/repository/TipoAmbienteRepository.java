package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.TipoAmbiente;
@Repository
public interface TipoAmbienteRepository extends JpaRepository<TipoAmbiente, Long> {

}
