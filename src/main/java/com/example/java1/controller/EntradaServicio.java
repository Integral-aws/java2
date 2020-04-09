package com.example.java1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.java1.dto.LegumbreDTO;
import com.example.java1.service.IServicioBO;

@RestController
public class EntradaServicio {

	@Autowired
	private IServicioBO iServicioBO;
	
	@GetMapping("serv1")
	public ResponseEntity<LegumbreDTO> obtenerLegumbres(){
		LegumbreDTO legumbreDTO = new LegumbreDTO();
		try {
			legumbreDTO.setMensaje("Transacción exitosa");
			legumbreDTO.setLegumbres(iServicioBO.obtenerLegumbres());
			return new ResponseEntity<LegumbreDTO>(legumbreDTO, HttpStatus.OK);
		} catch (Exception e) {
			legumbreDTO.setError(true);
			legumbreDTO.setMensaje("Error en servicio2: " + e.getMessage());
			return new ResponseEntity<LegumbreDTO>(legumbreDTO, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
}
