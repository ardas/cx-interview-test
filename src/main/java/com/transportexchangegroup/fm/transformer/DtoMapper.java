package com.transportexchangegroup.fm.transformer;

import com.transportexchangegroup.fm.dto.VehicleDto;
import com.transportexchangegroup.fm.entity.Vehicle;
import org.mapstruct.Mapper;

@Mapper
public interface DtoMapper {
    VehicleDto vehicleDto(Vehicle source);
}
