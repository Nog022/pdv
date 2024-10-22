package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.Tributacao;
@Repository
public interface TributacaoRepository extends JpaRepository<Tributacao, Long> {

}
