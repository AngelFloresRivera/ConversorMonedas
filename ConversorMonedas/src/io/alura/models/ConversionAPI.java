package io.alura.models;

public record ConversionAPI(String baseCode,
                         String targetCode,
                         double conversionRate,
                         double conversionResult) {
}
