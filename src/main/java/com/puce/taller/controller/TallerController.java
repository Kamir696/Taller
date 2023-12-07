package com.puce.taller.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.puce.taller.services.TallerService;
import com.puce.taller.model.Taller;

@RestController
@RequestMapping("/api/v1/profesores")
public class TallerController{
    @Autowired
    private TallerService profesorService;

    // Listar todos
    @GetMapping("/lista")
    public List<Taller> listarTodosLosProfesores() {
        return profesorService.listaProfesor();
    }

    // Guardar profesor
    @PostMapping("/up-date")
    public Taller guardarProfesor(@RequestBody Taller profesor) {
        profesorService.guardarProfesor(profesor);
        return profesor;
    }

    // Buscar por Id
    @GetMapping("/id/{id}")
    public Taller buscarPorId(@PathVariable Integer id) {
        return profesorService.obtenerProfesorID(id);
    }

    // Eliminar profesor
    @DeleteMapping("/delete/{id}")
    public String eliminarProfesor(@PathVariable Integer id) {
        Taller profesorExistente = profesorService.obtenerProfesorID(id);
        if (profesorExistente != null) {
            profesorService.eliminarProfesor(id);
            return "El profesor con ID " + id + " ha sido eliminado correctamente.";
        } else {
            return "El profesor con ID " + id + " no fue encontrado.";
        }
    }

    // Actualizar profesor
    @PutMapping("/up-date/{id}")
    public String actualizarProfesor(@PathVariable Integer id, @RequestBody Taller profesor) {
        Taller profesorExistente = profesorService.obtenerProfesorID(id);
        if (profesorExistente != null) {
            profesor.setId(id);
            profesorService.guardarProfesor(profesor);
            return "El profesor con ID " + id + " ha sido actualizado correctamente.";
        } else {
            return "El profesor con ID " + id + " no fue encontrado.";
        }
    }

    // Buscar por apellido
    @GetMapping("/last/{apellido}")
    public List<Taller> listarPorApellido(@PathVariable String apellido) {
        return profesorService.listarProfesorApellido(apellido);
    }

    // Listar por edad mayor a 35
    @GetMapping("/age")
    public List<Taller> listarProfesoresConEdadMayorA35() {
        return profesorService.listarProfesoresConEdadMayorA35();
    }

    // Listar por sueldo menor a 1500
    @GetMapping("/basic")
    public List<Taller> listarProfesoresConSueldoMenorA1500() {
        return profesorService.listarProfesoresConSueldoMenorA1500();
    }





}