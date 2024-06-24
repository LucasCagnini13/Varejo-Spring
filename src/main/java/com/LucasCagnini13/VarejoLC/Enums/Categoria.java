package com.LucasCagnini13.VarejoLC.Enums;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

public enum Categoria {

    ALIMENTOS("ALIMENTOS"),

    ELETRO_DOMESTICOS("ELETRO_DOMESTICOS"),

    LIMPEZA("LIMPEZA");

    final String valor;

    Categoria(String valor) {
        this.valor = valor;
    }

    @Converter(autoApply = true)
    public static class Mapeador implements AttributeConverter<Categoria, String> {

        @Override
        public String convertToDatabaseColumn(Categoria categoria) {
            return categoria.valor;
        }

        @Override
        public Categoria convertToEntityAttribute(String valor) {
            return switch (valor) {
                case "ALIMENTOS" -> ALIMENTOS;
                case "ELETRO_DOMESTICOS" -> ELETRO_DOMESTICOS;
                case "LIMPEZA" -> LIMPEZA;
                default -> null;
            };
        }
    }
}
