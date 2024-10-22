package net.originmobi.pdv.repository.cartao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.cartao.MaquinaCartao;
@Repository
public interface MaquinaCartaoRepository extends JpaRepository<MaquinaCartao, Long> {

}
