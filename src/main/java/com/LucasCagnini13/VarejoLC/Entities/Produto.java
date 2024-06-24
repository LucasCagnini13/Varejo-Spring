package com.LucasCagnini13.VarejoLC.Entities;

import com.LucasCagnini13.VarejoLC.Enums.Categoria;
import jakarta.persistence.*;

import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Double valor;
    private Double valorFornecedor;

//    private Fornecedor fornecedor;
    private Categoria categoria;
}
