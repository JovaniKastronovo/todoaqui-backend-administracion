package com.ridelnova.todoaquiapp.dto;
/**
 * <b>UbicacionesDto.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 20:03:24
 * @Todo Aqui App
 */
public class UbicacionesDto {

	private Integer idUbicacion;
	private String direccion;
	private double latitud;
	private double longitud;

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getLatitud() {
		return latitud;
	}

	public void setLatitud(double latitud) {
		this.latitud = latitud;
	}

	public double getLongitud() {
		return longitud;
	}

	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}

	@Override
	public String toString() {
		return "UbicacionesDto [idUbicacion=" + idUbicacion + ", direccion=" + direccion + ", latitud=" + latitud
				+ ", longitud=" + longitud + "]";
	}

}
