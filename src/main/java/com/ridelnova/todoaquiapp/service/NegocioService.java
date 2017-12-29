package com.ridelnova.todoaquiapp.service;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.NegocioDto;
/**
 * <b>NegocioService.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 23:41:56
 * @Todo Aqui App
 */
public interface NegocioService {

	/** 
	 * <b>obtenerNegociosByCategoria</b> TODO Descripcion del metodo
	 * @author Jovani Arzate C
	 * @param idCategoria
	 * @return
	 * @ultimaModificacion 26 nov. 2017 23:42:04
	 */
	List<NegocioDto> obtenerNegociosByCategoria(Integer idCategoria);
}
