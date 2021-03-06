package com.agranda.inventariovacunacion.repositorio;

import com.agranda.inventariovacunacion.dominio.entity.Empleado;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface EmpleadoRepository extends CrudRepository<Empleado, Long> {

    @Query("SELECT e FROM Empleado e WHERE e.cedula = ?1")
    Optional<Empleado> filtrarPorCedula(String cedula);

    @Query("SELECT e FROM Empleado e WHERE e.estadoVacunacion = com.agranda.inventariovacunacion.dominio.enumerator.EstadoVacunacion.VACUNADO")
    Iterable<Empleado> obtenerEmpleadosVacunados();

    @Query("SELECT e FROM Empleado e WHERE e.estadoVacunacion = com.agranda.inventariovacunacion.dominio.enumerator.EstadoVacunacion.NO_VACUNADO")
    Iterable<Empleado> obtenerEmpleadosNoVacunados();

    @Query("SELECT e FROM Empleado e JOIN e.vacuna v WHERE v.tipoVacuna = com.agranda.inventariovacunacion.dominio.enumerator.TipoVacuna.SPUTNIK_V")
    Iterable<Empleado> obtenerEmpleadosSputnikV();

    @Query("SELECT e FROM Empleado e JOIN e.vacuna v WHERE v.tipoVacuna = com.agranda.inventariovacunacion.dominio.enumerator.TipoVacuna.ASTRA_ZENECA")
    Iterable<Empleado> obtenerEmpleadosAstraZeneca();

    @Query("SELECT e FROM Empleado e JOIN e.vacuna v WHERE v.tipoVacuna = com.agranda.inventariovacunacion.dominio.enumerator.TipoVacuna.PFIZER")
    Iterable<Empleado> obtenerEmpleadosPfizer();

    @Query("SELECT e FROM Empleado e JOIN e.vacuna v WHERE v.tipoVacuna = com.agranda.inventariovacunacion.dominio.enumerator.TipoVacuna.JHONSON_AND_JHONSON")
    Iterable<Empleado> obtenerEmpleadosJhonsonAndJhonson();

    @Query("SELECT e FROM Empleado e JOIN e.vacuna v WHERE v.fechaVacunacion BETWEEN ?1 AND ?2")
    Iterable<Empleado> filtrarPorRangoFechaVacunacion(LocalDate fechaInicio, LocalDate fechaFin);
}
