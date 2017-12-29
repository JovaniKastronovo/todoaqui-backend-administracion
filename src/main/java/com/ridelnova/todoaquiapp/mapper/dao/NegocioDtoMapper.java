package com.ridelnova.todoaquiapp.mapper.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import com.ridelnova.todoaquiapp.dto.NegocioDto;
/**
 * <b>NegocioDtoMapper.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 21:49:36
 * @Todo Aqui App
 */
public class NegocioDtoMapper implements RowMapper{
	public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
		NegocioDto negocioDto = new NegocioDto();
		negocioDto.setIdNegocio(rs.getInt("C.id_negocio"));
		negocioDto.setNombre(rs.getString("C.nombre"));
		negocioDto.setDescripcion(rs.getString("C.descripcion"));
		negocioDto.setEstatus(rs.getBoolean("C.estatus"));
		negocioDto.setDomicilio(rs.getString("C.domicilio"));
		negocioDto.setReitinCalificacion(rs.getDouble("C.calificacion"));
		negocioDto.setUsoTarjeta(rs.getBoolean("C.uso_tarjeta"));
		negocioDto.setServicioDomicilio(rs.getBoolean("C.servicio_domicilio"));
		negocioDto.setEstacionamiento(rs.getBoolean("C.estacionamiento"));
		negocioDto.setHoraFeliz(rs.getBoolean("C.hora_feliz_qr"));
		negocioDto.setComidaLlevar(rs.getBoolean("C.comida_llevar"));
		negocioDto.setInternerDisponible(rs.getBoolean("C.internet"));
		negocioDto.setReservaciones(rs.getBoolean("C.reservaciones"));
		negocioDto.setTelefono(rs.getString("C.telefonos"));
		negocioDto.setReitinPrecio(rs.getDouble("C.nivel_precio"));
		negocioDto.setIdUbicacion(rs.getInt("C.id_ubicacion"));
		
		return negocioDto;
	}
	
}
