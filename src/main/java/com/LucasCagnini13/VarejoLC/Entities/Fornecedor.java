/*

package com.LucasCagnini13.VarejoLC.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@EqualsAndHashCode
public class Fornecedor extends PessoaJuridica{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    public Fornecedor(Integer id,String nome, String cnpj, String nomeFantasia){
        super(nome,cnpj,nomeFantasia);
        this.id = id;
    }

}
*/