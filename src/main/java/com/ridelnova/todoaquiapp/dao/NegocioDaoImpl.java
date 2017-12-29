package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ridelnova.todoaquiapp.dto.NegocioDto;
import com.ridelnova.todoaquiapp.mapper.dao.NegocioDtoMapper;
import com.ridelnova.todoaquiapp.utils.SpringJdbc;

/**
 * <b>NegocioDaoImpl.java</b> TODO descripcion del componente.
 * 
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 20:02:33
 * @Todo Aqui App
 */
@Repository
public class NegocioDaoImpl extends SpringJdbc implements NegocioDao {

	private String qryNegociosByCategoria = "SELECT C.id_negocio\r\n" + 
			"     , C.nombre\r\n" + 
			"     , C.descripcion\r\n" + 
			"     , C.estatus\r\n" + 
			"     , C.domicilio\r\n" + 
			"     , C.uso_tarjeta\r\n" + 
			"     , C.servicio_domicilio\r\n" + 
			"     , C.estacionamiento\r\n" + 
			"     , C.hora_feliz_qr\r\n" + 
			"     , C.comida_llevar\r\n" + 
			"     , C.internet\r\n" + 
			"     , C.reservaciones\r\n" + 
			"     , C.telefonos\r\n" + 
			"     , C.nivel_precio\r\n" + 
			"     , C.id_ubicacion\r\n" + 
			 "  ,   C.calificacion \r\n" + 
			"\r\n" + 
			" FROM\r\n" + 
			"  CAT_CATEGORIAS A, CATEGORIA_NEGOCIO B, NEGOCIO C, UBICACION D\r\n" + 
			"WHERE\r\n" + 
			"  A.ID_CATEGORIA = B.ID_CATEGORIA\r\n" + 
			"  AND B.ID_NEGOCIO = C.ID_NEGOCIO\r\n" + 
			"  AND C.ID_UBICACION = D.ID_UBICACION\r\n" + 
			"  AND A.ID_CATEGORIA = ?";

	@Override
	public List<NegocioDto> consultarNegociosByCategoria(Integer idCategoria) {
		return jdbcTemplate.query(qryNegociosByCategoria, new Object[] { idCategoria }, new NegocioDtoMapper());
	}

}
