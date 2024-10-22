package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Telefone;
@Repository
public interface TelefoneRepository extends JpaRepository<Telefone, Long>{
	
	public Telefone findByCodigoIn(long codigo);

}
