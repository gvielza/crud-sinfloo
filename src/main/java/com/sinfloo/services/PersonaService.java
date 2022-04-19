package com.sinfloo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinfloo.interfaces.IPersona;
import com.sinfloo.interfaceservices.IPersonaService;
import com.sinfloo.models.Persona;
@Service
public class PersonaService implements IPersonaService{
@Autowired
private IPersona data;
	@Override
	public List<Persona> listar() {
		return (List<Persona>) data.findAll();
		
	}

	@Override
	public int save(Persona p) {
		int var=0;
		Persona per=data.save(p);
		if (!per.equals(null)) {
			var=1;
		}
		return var;
	}

	

	@Override
	public Optional<Persona> listarID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
