package com.ridelnova.todoaquiapp.service;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.UbicacionesDto;

public interface TodoAquiService {

	List<UbicacionesDto> obtenerUbicacionesCercanas();
	void insertarUbicacion(UbicacionesDto ubicacionesDto);
}
