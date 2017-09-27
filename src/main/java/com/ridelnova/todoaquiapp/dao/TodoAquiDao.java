package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.UbicacionesDto;

public interface TodoAquiDao {
	
	List<UbicacionesDto> consultarUbicacionesCercanas();
	void insertarUbicacion(UbicacionesDto coordenadasDto);
}
