package com.example.java1.dto;

import java.util.List;

import com.example.java1.model.Legumbre;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LegumbreDTO extends ResponseDTO {

	private List<Legumbre> legumbres;
	
}
