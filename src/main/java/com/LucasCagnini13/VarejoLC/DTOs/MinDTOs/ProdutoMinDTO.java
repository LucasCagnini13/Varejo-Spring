package com.LucasCagnini13.VarejoLC.DTOs.MinDTOs;

import com.LucasCagnini13.VarejoLC.Entities.Produto;
import lombok.Data;

import java.util.Optional;

@Data
public class ProdutoMinDTO {

    private String nome;
    private Double valor;
    private Double valorFornecedor;
    private String nomeFornecedor;
    private String categoria;

    public ProdutoMinDTO(Produto produto){

        nome = produto.getNome();
        valor = produto.getValor();
        valorFornecedor = produto.getValorFornecedor();
        nomeFornecedor = produto.getNome();
        categoria = produto.getCategoria().toString();
    }

}
