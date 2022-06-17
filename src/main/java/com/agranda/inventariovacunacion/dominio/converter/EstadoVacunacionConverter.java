package com.agranda.inventariovacunacion.dominio.converter;

import com.agranda.inventariovacunacion.dominio.enumerator.EstadoVacunacion;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;
import java.util.stream.Stream;

@Converter(autoApply = true)
public class EstadoVacunacionConverter implements AttributeConverter<EstadoVacunacion, String> {

    @Override
    public String convertToDatabaseColumn(EstadoVacunacion estadoVacunacion) {
        if (estadoVacunacion == null) {
            return null;
        }
        return estadoVacunacion.getCodigo();
    }

    @Override
    public EstadoVacunacion convertToEntityAttribute(String codigo) {
        if (codigo == null) {
            return null;
        }

        return Stream.of(EstadoVacunacion.values())
                .filter(c -> c.getCodigo().equals(codigo))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
