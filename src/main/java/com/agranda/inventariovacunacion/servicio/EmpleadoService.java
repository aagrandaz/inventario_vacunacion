package com.agranda.inventariovacunacion.servicio; //

import com.agranda.inventariovacunacion.dominio.entity.Empleado;

import java.time.LocalDate;
import java.util.Optional;

public interface EmpleadoService extends GenericService<Empleado> {

    Optional<Empleado> filtrarPorCedula(String cedula);

    Iterable<Empleado> obtenerEmpleadosVacunados();

    Iterable<Empleado> obtenerEmpleadosNoVacunados();

    Iterable<Empleado> obtenerEmpleadosSputnikV();

    Iterable<Empleado> obtenerEmpleadosAstraZeneca();

    Iterable<Empleado> obtenerEmpleadosPfizer();

    Iterable<Empleado> obtenerEmpleadosJhonsonAndJhonson();

    Iterable<Empleado> filtrarPorRangoFechaVacunacion(LocalDate fechaInicio, LocalDate fechaFin);
}
