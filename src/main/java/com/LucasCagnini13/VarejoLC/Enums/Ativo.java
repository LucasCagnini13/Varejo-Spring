package com.LucasCagnini13.VarejoLC.Enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

public enum Ativo {

    FUNCIONARIO("FUNCIONARIO"),

    ADMIN("ADMIN");

    final String valor;

    Ativo(String valor) {
        this.valor = valor;
    }

    @Converter(autoApply = true)
    public static class Mapeador implements AttributeConverter<Ativo, String> {

        @Override
        public String convertToDatabaseColumn(Ativo ativo) {
            return ativo.valor;
        }

        @Override
        public Ativo convertToEntityAttribute(String valor) {
            return switch (valor) {
                case "FUNCIONARIO" -> FUNCIONARIO;
                case "ADMIN" -> ADMIN;
                default -> null;
            };
        }
    }


}
