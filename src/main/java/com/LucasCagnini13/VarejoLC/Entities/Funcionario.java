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
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Funcionario extends PessoaFisica{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Setor setor;

    public Funcionario(Integer id, Setor setor,String nome, String cpf){
        super(nome, cpf);
        this.id = id;
        this.setor = setor;
    }

}
*/