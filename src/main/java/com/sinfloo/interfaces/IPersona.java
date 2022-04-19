package com.sinfloo.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.sinfloo.models.Persona;
@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{

}
