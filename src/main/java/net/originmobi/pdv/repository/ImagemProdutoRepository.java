package net.originmobi.pdv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.originmobi.pdv.model.ImagemProduto;
@Repository
public interface ImagemProdutoRepository extends JpaRepository<ImagemProduto, Long> {
	
	public ImagemProduto findByProdutoCodigo(Long codigo);

}
