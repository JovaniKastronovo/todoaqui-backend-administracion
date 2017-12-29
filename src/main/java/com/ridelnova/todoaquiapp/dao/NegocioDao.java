package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import com.ridelnova.todoaquiapp.dto.NegocioDto;
/**
 * <b>NegocioDao.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 23:15:59
 * @Todo Aqui App
 */
public interface NegocioDao {
	
	/** 
	 * <b>consultarNegociosByCategoria</b> TODO Descripcion del metodo
	 * @author Jovani Arzate C
	 * @param idCategoria
	 * @return
	 * @ultimaModificacion 26 nov. 2017 23:16:02
	 */
	List<NegocioDto> consultarNegociosByCategoria(Integer idCategoria);
}
