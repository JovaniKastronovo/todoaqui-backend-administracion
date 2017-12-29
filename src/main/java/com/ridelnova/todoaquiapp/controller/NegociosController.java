package com.ridelnova.todoaquiapp.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ridelnova.todoaquiapp.dto.CategoriaDto;
import com.ridelnova.todoaquiapp.dto.NegocioDto;

import com.ridelnova.todoaquiapp.service.NegocioService;
/**
 * <b>NegociosController.java</b>  TODO descripcion del componente.
 * @author Jovani Arzate C
 * @version 1.0
 * @ultimaModificacion 27 nov. 2017 0:00:19
 * @Todo Aqui App
 */
@Component
@RestController
@RequestMapping("/rest/api")
public class NegociosController {
	
	@Autowired
	private NegocioService negocioService;
	private static Logger log = Logger.getLogger(NegociosController.class);

	@RequestMapping(value = "/obtenerNegociosByCategoria", method = RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<List<NegocioDto>> obtenerNegocios(@RequestBody String idCategoria) {
		log.info(">>>obtenerNegocios()<<<");
	
		List<NegocioDto> listNegocios = null;
		
		listNegocios = negocioService.obtenerNegociosByCategoria(Integer.parseInt(idCategoria));

		if (listNegocios != null) {
			return new ResponseEntity<List<NegocioDto>>(listNegocios, HttpStatus.OK);
		} else {
			return new ResponseEntity<List<NegocioDto>>(listNegocios, HttpStatus.NOT_FOUND);
		}
	}
}