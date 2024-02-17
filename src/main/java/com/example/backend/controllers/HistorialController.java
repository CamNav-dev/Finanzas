package com.example.backend.controllers;

import com.example.backend.dtos.HistorialDTO;
import com.example.backend.serviceimplements.HistorialServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backend.entities.historial;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/historial")
public class HistorialController {
    @Autowired
    private HistorialServiceImplements myService;

    // Add an item to table
    @PostMapping
    public void registrar(@RequestBody HistorialDTO dto) {
        ModelMapper m = new ModelMapper();
        historial myItem = m.map(dto, historial.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Long id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public HistorialDTO listarId(@PathVariable("id")Long id){
        ModelMapper m = new ModelMapper();
        HistorialDTO myItem = m.map(myService.listId(id), HistorialDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<HistorialDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, HistorialDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody HistorialDTO dto) {
        ModelMapper m = new ModelMapper();
        historial d = m.map(dto, historial.class);
        myService.insert(d);
    }
}
