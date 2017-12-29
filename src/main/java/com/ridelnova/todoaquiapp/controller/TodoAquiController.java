package com.ridelnova.todoaquiapp.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.ridelnova.todoaquiapp.dto.UbicacionesDto;
import com.ridelnova.todoaquiapp.service.TodoAquiService;


@Component
@RestController
@RequestMapping("/rest/api")
public class TodoAquiController {

	@Autowired
	private TodoAquiService todoAquiService; 
	
	private static final Logger log = Logger.getLogger(TodoAquiController.class);
	
	@RequestMapping(value = "/consultaLugaresCercanos", method = RequestMethod.GET)
	public ResponseEntity<String> entidadCercana() {
		log.info("Lugares cercanos, calculando distancia Heaversine...");
		
		StringBuilder builder = new StringBuilder();
		for(UbicacionesDto ubicacionesDto: todoAquiService.obtenerUbicacionesCercanas()){
			log.info(ubicacionesDto.toString());
			builder.append(ubicacionesDto.toString()).append("\n");
		}
		return new ResponseEntity<String>("Ubicaciones: "+builder.toString(), HttpStatus.OK);
	}
	

	@RequestMapping(value = "/guardaUbicacion", method = RequestMethod.POST, headers ="Accept=application/json")
	@ResponseBody
	public ResponseEntity<?> guardaUbicacion(@RequestBody UbicacionesDto ubicacionesDto) {
		log.info("Guardando coordenadas...");
		todoAquiService.insertarUbicacion(ubicacionesDto);
		
		Gson gson = new Gson();
		String json=gson.toJson(ubicacionesDto);
		return new ResponseEntity<String>(json, HttpStatus.OK);
		//return new ResponseEntity("Successfullys", new HttpHeaders(), HttpStatus.OK);
	}
	
	
}
