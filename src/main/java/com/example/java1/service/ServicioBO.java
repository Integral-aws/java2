package com.example.java1.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.java1.dao.ServicioDAO;
import com.example.java1.model.Legumbre;

@Service
public class ServicioBO implements IServicioBO {
	
	@Autowired
	private ServicioDAO servicioDAO;

	@Override
	public List<Legumbre> obtenerLegumbres() {
		return servicioDAO.findAll();
	}

}
