package com.LucasCagnini13.VarejoLC.Controller;

import com.LucasCagnini13.VarejoLC.DTOs.MinDTOs.ProdutoMinDTO;
import com.LucasCagnini13.VarejoLC.Entities.Produto;
import com.LucasCagnini13.VarejoLC.Services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/produtos")
public class ProdutoController {

    @Autowired
    ProdutoService produtoService;

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoMinDTO> findById(@PathVariable Integer id){

        return ResponseEntity.ok(produtoService.findById(id));
    }

    @GetMapping
    public ResponseEntity<List<ProdutoMinDTO>> findAll(){

        return ResponseEntity.ok(produtoService.findAll());
    }

    @PostMapping
    public ResponseEntity<ProdutoMinDTO> addProduto(@RequestBody Produto produto){

        return ResponseEntity.ok(produtoService.addProduto(produto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProduto(@PathVariable Integer id){

        produtoService.deleteProduto(id);
        return ResponseEntity.ok("Produto deletado com sucesso");
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProdutoMinDTO> updateProduto(@PathVariable Integer id, @RequestBody Produto produto){

        return ResponseEntity.ok(produtoService.updateProduto(id,produto));
    }
}
