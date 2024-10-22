package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Cidade;
@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Long>{

}
