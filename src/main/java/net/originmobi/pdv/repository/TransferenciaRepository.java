package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Transferencia;
@Repository
public interface TransferenciaRepository extends JpaRepository<Transferencia, Long> {

}
