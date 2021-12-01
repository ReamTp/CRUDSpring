package com.proyecto.crudspring.interfacesServices;

import com.proyecto.crudspring.models.Persona;

import java.util.List;
import java.util.Optional;

public interface IPersonaService {
    List<Persona> listar();
    Optional<Persona> listarId(int id);
    int save(Persona p);
    void delete(int id);
}
