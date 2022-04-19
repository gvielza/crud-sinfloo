package com.sinfloo.interfaceservices;

import java.util.List;
import java.util.Optional;

import com.sinfloo.models.Persona;

public interface IPersonaService {
	public List<Persona> listar();

	public Optional<Persona> listarID(int id);

	public int save(Persona p);

	public void delete(int id);

}
