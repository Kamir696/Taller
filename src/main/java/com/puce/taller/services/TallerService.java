package com.puce.taller.services;

import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.puce.taller.model.Taller;
import com.puce.taller.repository.TallerRepository;

@Service
public class TallerService {

    @Autowired
    private TallerRepository repositorio;

    //Listar profesores
    public List<Taller> listaProfesor(){
        return repositorio.findAll();
    }

    //Guardar profesores
	public void guardarProfesor (Taller profesor)
	{
		repositorio.save(profesor);		
	}

    //Obtener profesor por el ID
	public Taller obtenerProfesorID (Integer id) 
	{
		return repositorio.findById(id).get();
	}

    //Eliminar profesor
    public void eliminarProfesor(Integer id)
	{
		repositorio.deleteById(id);
	}

    //Listar por apellido
    public List<Taller> listarProfesorApellido(String apellido){
        return repositorio.findByApellido(apellido);
    }

    //Listar por edad
    public List<Taller> listarProfesoresConEdadMayorA35() {
        int edad = 35;
        return repositorio.findByEdadGreaterThan(edad);
    }

    //Listar por sueldo
    public List<Taller> listarProfesoresConSueldoMenorA1500() {
        float sueldo = 1500.0f;
        return repositorio.findBySueldoLessThan(sueldo);
    }
    
}
