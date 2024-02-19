package com.example.backend.controllers;

import com.example.backend.serviceimplements.UsuariosServiceImplements;
import com.example.backend.serviceinterfaces.UsuarioService;
import com.example.backend.entities.usuarios;
import com.example.backend.dtos.usuarioDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/usuario")
public class UsuarioController {
    @Autowired
    private UsuarioService myService;

    @PostMapping
    public void registrar(@RequestBody usuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        usuarios myItem = m.map(dto, usuarios.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Long id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public usuarioDTO listarId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        usuarioDTO myItem = m.map(myService.listId(id), usuarioDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<usuarioDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, usuarioDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody usuarioDTO dto) {
        ModelMapper m = new ModelMapper();
        usuarios d = m.map(dto, usuarios.class);
        myService.insert(d);
    }
}
