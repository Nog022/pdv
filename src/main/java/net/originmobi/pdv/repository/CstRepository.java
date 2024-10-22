package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Cst;
@Repository
public interface CstRepository extends JpaRepository<Cst, Long>{

}
