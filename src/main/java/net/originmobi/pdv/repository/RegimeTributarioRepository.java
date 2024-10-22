package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.RegimeTributario;
@Repository
public interface RegimeTributarioRepository extends JpaRepository<RegimeTributario, Long>{

}
