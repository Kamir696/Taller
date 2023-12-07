package com.puce.taller.repository;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

import com.puce.taller.model.Taller;

public interface TallerRepository extends JpaRepository <Taller, Integer>{
    List<Taller> findByNombre(String nombre);
    List<Taller> findByApellido(String apellido);
    List<Taller> findByEdadGreaterThan(int edad);
    List<Taller> findBySueldoLessThan(float sueldo);
    List<Taller> findByExperiencia(int Experiencia);
    List<Taller> findByTelefono(String telefono);
}
