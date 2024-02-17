package com.example.backend.controllers;

import com.example.backend.dtos.InfoContableDTO;
import com.example.backend.serviceimplements.InfoContableServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backend.entities.infocontable;

import java.util.List;
import java.util.stream.Collectors;
@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/infocontable")
public class InfoContableController {
    @Autowired
    private InfoContableServiceImplements myService;

    // Add an item to table
    @PostMapping
    public void registrar(@RequestBody InfoContableDTO dto) {
        ModelMapper m = new ModelMapper();
        infocontable myItem = m.map(dto, infocontable.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public InfoContableDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        InfoContableDTO myItem = m.map(myService.listId(id), InfoContableDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<InfoContableDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, InfoContableDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody InfoContableDTO dto) {
        ModelMapper m = new ModelMapper();
        infocontable d = m.map(dto, infocontable.class);
        myService.insert(d);
    }
}
