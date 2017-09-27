package com.ridelnova.todoaquiapp.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.stereotype.Repository;

import com.ridelnova.todoaquiapp.dto.UbicacionesDto;
import com.ridelnova.todoaquiapp.utils.SpringJdbc;

@Repository
public class TodoAquiDaoImpl extends SpringJdbc implements TodoAquiDao {

	private String qrySelectUbicaciones = "SELECT * FROM UBICACIONES";
	private String qryInsertUbicaciones = "INSERT UBICACIONES(DIRECCION, LATITUD, LONGITUD) VALUES(?,?,?)";

	@Override
	public List<UbicacionesDto> consultarUbicacionesCercanas() {

		return jdbcTemplate.query(qrySelectUbicaciones, BeanPropertyRowMapper.newInstance(UbicacionesDto.class));
	}

	@Override
	public void insertarUbicacion(UbicacionesDto ubicaciones) {
		jdbcTemplate.update(qryInsertUbicaciones,
				new Object[] { ubicaciones.getDireccion(), ubicaciones.getLatitud(), ubicaciones.getLongitud() });
	}

}
