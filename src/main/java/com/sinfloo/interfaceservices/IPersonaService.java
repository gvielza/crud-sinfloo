package com.sinfloo.interfaceservices;

import java.util.List;

import com.sinfloo.models.Persona;

public interface IPersonaService {
	public List<Persona>listar();
	public int save(Persona p);
	public void delete(Persona p);

}
