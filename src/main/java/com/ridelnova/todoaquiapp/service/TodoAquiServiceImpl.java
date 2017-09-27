package com.ridelnova.todoaquiapp.service;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ridelnova.todoaquiapp.dao.TodoAquiDao;
import com.ridelnova.todoaquiapp.dto.UbicacionesDto;
@Service
public class TodoAquiServiceImpl implements TodoAquiService {

	private static final Logger log = Logger.getLogger(TodoAquiServiceImpl.class);
	
	@Autowired
	TodoAquiDao todoAquiDao;
	
	@Override
	public List<UbicacionesDto> obtenerUbicacionesCercanas() {
		return todoAquiDao.consultarUbicacionesCercanas();
	}

	@Override
	public void insertarUbicacion(UbicacionesDto ubicacionesDto) {
		todoAquiDao.insertarUbicacion(ubicacionesDto);
		
		log.info(">>>Se guardo correctamente la ubicacion<<<");
	}

}
