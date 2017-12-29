package com.ridelnova.todoaquiapp.dto;

/**
 * <b>NegocioDto.java</b> TODO descripcion del componente.
 * 
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 26 nov. 2017 20:03:16
 * 
 *                     /* id_negocio INT(11) NOT NULL AUTO_INCREMENT, nombre
 *                     VARCHAR(45) DEFAULT NULL, descripcion VARCHAR(45) DEFAULT
 *                     NULL, estatus BIT(1) DEFAULT NULL, domicilio VARCHAR(45)
 *                     DEFAULT NULL, calificacion DOUBLE DEFAULT NULL,
 *                     uso_tarjeta BIT(1) DEFAULT NULL, servicio_domicilio
 *                     BIT(1) DEFAULT NULL, estacionamiento BIT(1) DEFAULT NULL,
 *                     hora_feliz_qr BIT(1) DEFAULT NULL, comida_llevar BIT(1)
 *                     DEFAULT NULL, internet BIT(1) DEFAULT NULL, reservaciones
 *                     BIT(1) DEFAULT NULL, telefonos VARCHAR(45) DEFAULT NULL,
 *                     nivel_precio INT(11) DEFAULT NULL, id_ubicacion INT(11)
 *                     DEFAULT NULL,
 * 
 * 
 * @Todo Aqui App
 */
public class NegocioDto {

	private Integer idNegocio;
	private String nombre;
	private String descripcion;
	private boolean estatus;
	private String domicilio;
	private double reitinCalificacion;
	private boolean usoTarjeta;
	private boolean servicioDomicilio;
	private boolean estacionamiento;
	private boolean horaFeliz;
	private boolean comidaLlevar;
	private boolean internerDisponible;
	private boolean reservaciones;
	private String telefono;
	private double reitinPrecio;
	private Integer idUbicacion;

	public Integer getIdNegocio() {
		return idNegocio;
	}

	public void setIdNegocio(Integer idNegocio) {
		this.idNegocio = idNegocio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEstatus() {
		return estatus;
	}

	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public double getReitinCalificacion() {
		return reitinCalificacion;
	}

	public void setReitinCalificacion(double reitinCalificacion) {
		this.reitinCalificacion = reitinCalificacion;
	}

	public boolean isUsoTarjeta() {
		return usoTarjeta;
	}

	public void setUsoTarjeta(boolean usoTarjeta) {
		this.usoTarjeta = usoTarjeta;
	}

	public boolean isServicioDomicilio() {
		return servicioDomicilio;
	}

	public void setServicioDomicilio(boolean servicioDomicilio) {
		this.servicioDomicilio = servicioDomicilio;
	}

	public boolean isEstacionamiento() {
		return estacionamiento;
	}

	public void setEstacionamiento(boolean estacionamiento) {
		this.estacionamiento = estacionamiento;
	}

	public boolean isHoraFeliz() {
		return horaFeliz;
	}

	public void setHoraFeliz(boolean horaFeliz) {
		this.horaFeliz = horaFeliz;
	}

	public boolean isComidaLlevar() {
		return comidaLlevar;
	}

	public void setComidaLlevar(boolean comidaLlevar) {
		this.comidaLlevar = comidaLlevar;
	}

	public boolean isInternerDisponible() {
		return internerDisponible;
	}

	public void setInternerDisponible(boolean internerDisponible) {
		this.internerDisponible = internerDisponible;
	}

	public boolean isReservaciones() {
		return reservaciones;
	}

	public void setReservaciones(boolean reservaciones) {
		this.reservaciones = reservaciones;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public double getReitinPrecio() {
		return reitinPrecio;
	}

	public void setReitinPrecio(double reitinPrecio) {
		this.reitinPrecio = reitinPrecio;
	}

	public Integer getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(Integer idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "NegocioDto [idNegocio=" + idNegocio + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", estatus=" + estatus + ", domicilio=" + domicilio + ", reitinCalificacion=" + reitinCalificacion
				+ ", usoTarjeta=" + usoTarjeta + ", servicioDomicilio=" + servicioDomicilio + ", estacionamiento="
				+ estacionamiento + ", horaFeliz=" + horaFeliz + ", comidaLlevar=" + comidaLlevar
				+ ", internerDisponible=" + internerDisponible + ", reservaciones=" + reservaciones + ", telefono="
				+ telefono + ", reitinPrecio=" + reitinPrecio + ", idUbicacion=" + idUbicacion + "]";
	}

	
	
}
