package com.example.backend.controllers;

import com.example.backend.dtos.PeriodoDTO;
import com.example.backend.serviceimplements.PeriodoServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.backend.entities.periodo;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/periodo")
public class PeriodoController {
    @Autowired
    private PeriodoServiceImplements myService;

    @PostMapping
    public void registrar(@RequestBody PeriodoDTO dto) {
        ModelMapper m = new ModelMapper();
        periodo myItem = m.map(dto, periodo.class);
        myService.insert(myItem);
    }

    // Delete an item by ID on table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Integer id){
        myService.delete(id);
    }

    // Retrieve an items by ID from table
    @GetMapping("/{id}")
    public PeriodoDTO listarId(@PathVariable("id")Integer id){
        ModelMapper m = new ModelMapper();
        PeriodoDTO myItem = m.map(myService.listId(id), PeriodoDTO.class);
        return myItem;
    }

    // Retrieve all items from table
    @GetMapping
    public List<PeriodoDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, PeriodoDTO.class);
        }).collect(Collectors.toList());
    }

    // (Exclusive to controller) Modify values on table
    @PutMapping
    public void modificar(@RequestBody PeriodoDTO dto) {
        ModelMapper m = new ModelMapper();
        periodo d = m.map(dto, periodo.class);
        myService.insert(d);
    }
}
