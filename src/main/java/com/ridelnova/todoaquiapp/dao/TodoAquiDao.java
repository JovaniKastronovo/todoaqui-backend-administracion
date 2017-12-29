package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.UbicacionesDto;
/**
 * <b>TodoAquiDao.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 20:03:31
 * @Todo Aqui App
 */
public interface TodoAquiDao {
	
	/** 
	 * <b>consultarUbicacionesCercanas</b> TODO Descripcion del metodo
	 * @author Jovani Arzate C
	 * @return
	 * @ultimaModificacion 26 nov. 2017 20:03:33
	 */
	List<UbicacionesDto> consultarUbicacionesCercanas();
	
	/** 
	 * <b>insertarUbicacion</b> TODO Descripcion del metodo
	 * @author Jovani Arzate C
	 * @param coordenadasDto
	 * @ultimaModificacion 26 nov. 2017 20:03:35
	 */
	void insertarUbicacion(UbicacionesDto coordenadasDto);
}
