package com.LucasCagnini13.VarejoLC.Repositories;

import com.LucasCagnini13.VarejoLC.Entities.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
}
