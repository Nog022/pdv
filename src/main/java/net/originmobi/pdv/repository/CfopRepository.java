package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.CFOP;
@Repository
public interface CfopRepository extends JpaRepository<CFOP, Long>{

}
