package com.example.java1.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.java1.model.Legumbre;

public interface ServicioDAO extends JpaRepository<Legumbre, Integer> {

}
