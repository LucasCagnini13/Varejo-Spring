package com.LucasCagnini13.VarejoLC.Services;

import com.LucasCagnini13.VarejoLC.DTOs.MinDTOs.ProdutoMinDTO;
import com.LucasCagnini13.VarejoLC.Entities.Produto;
import com.LucasCagnini13.VarejoLC.Repositories.ProdutoRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService {

    @Autowired
    ProdutoRepository produtoRepository;

    @Transactional
    public ProdutoMinDTO findById(Integer id){

        return new ProdutoMinDTO(produtoRepository.findById(id).get());

    }

    @Transactional
    public List<ProdutoMinDTO> findAll(){

        List<Produto> produtos = produtoRepository.findAll();
        return produtos.stream().map(ProdutoMinDTO::new).toList();
    }

    @Transactional
    public ProdutoMinDTO addProduto(Produto produto){

        produtoRepository.save(produto);
        return new ProdutoMinDTO(produto);
    }

    @Transactional
    public void deleteProduto(Integer id){

        produtoRepository.deleteById(id);
    }

    @Transactional
    public ProdutoMinDTO deleteProduto(Produto produto){

        produtoRepository.save(produto);
        return new ProdutoMinDTO(produto);
    }

    @Transactional
    public ProdutoMinDTO updateProduto(Integer id,Produto produto){

        Optional<Produto> produtoPersist = produtoRepository.findById(id);

        if(produtoPersist.isPresent()){

            produtoPersist.get().setNome(produto.getNome());
            produtoPersist.get().setValor(produto.getValor());
            produtoPersist.get().setValorFornecedor(produto.getValorFornecedor());
            produtoPersist.get().setCategoria(produto.getCategoria());
            produtoRepository.save(produtoPersist.get());
            return new ProdutoMinDTO(produtoPersist.get());
        }
        return null;
    }
}
