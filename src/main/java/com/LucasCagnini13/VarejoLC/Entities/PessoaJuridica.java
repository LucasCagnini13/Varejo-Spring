package com.LucasCagnini13.VarejoLC.Entities;

import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode
@MappedSuperclass
public class PessoaJuridica {

    private String nome;
    private String cnpj;
    private String nomeFantasia;

}
