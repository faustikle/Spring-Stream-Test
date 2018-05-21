package com.faustikle.estoqueservice.infrastructure.repository;

import com.faustikle.estoqueservice.domain.model.produto.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
