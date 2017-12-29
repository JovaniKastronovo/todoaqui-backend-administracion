package com.ridelnova.todoaquiapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ridelnova.todoaquiapp.dao.NegocioDao;
import com.ridelnova.todoaquiapp.dto.NegocioDto;
/**
 * <b>NegocioServiceImpl.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 23:41:40
 * @Todo Aqui App
 */
@Service
public class NegocioServiceImpl implements NegocioService{
	
	@Autowired
	private NegocioDao negocioDao;
	
	@Override
	public List<NegocioDto> obtenerNegociosByCategoria(Integer idCategoria) {
		return negocioDao.consultarNegociosByCategoria(idCategoria);
	}

}
