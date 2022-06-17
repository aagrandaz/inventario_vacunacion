package com.agranda.inventariovacunacion.dominio.mapper;

import com.agranda.inventariovacunacion.dominio.dto.EmpleadoAdminDTO;
import com.agranda.inventariovacunacion.dominio.dto.EmpleadoDTO;
import com.agranda.inventariovacunacion.dominio.dto.EmpleadoGetAllDTO;
import com.agranda.inventariovacunacion.dominio.dto.VacunaDTO;
import com.agranda.inventariovacunacion.dominio.entity.Empleado;
import com.agranda.inventariovacunacion.dominio.entity.Vacuna;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MapStructMapper {

    EmpleadoAdminDTO empleadoAdminDto(Empleado empleado);

    Empleado empleadoAdmin(EmpleadoAdminDTO empleadoAdminDTO);

    EmpleadoDTO empleadoDto(Empleado empleado);

    Empleado empleado(EmpleadoDTO empleadoDTO);

    EmpleadoGetAllDTO empleadoGetAllDTO(Empleado empleado);

    VacunaDTO vacunaDTO(Vacuna vacuna);

    Vacuna vacuna(VacunaDTO vacunaDTO);
}
