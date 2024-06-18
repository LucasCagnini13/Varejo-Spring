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
@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
public class Funcionario extends PessoaFisica{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private Setor setor;

}
