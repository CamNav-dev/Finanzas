package com.example.backend.controllers;


import com.example.backend.dtos.cuentaDTO;
import com.example.backend.entities.cuenta;
import com.example.backend.serviceimplements.CuentaServiceImplements;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/cuenta")
public class CuentaController {
    @Autowired
    private CuentaServiceImplements myService;

    @PostMapping
    public void registrar(@RequestBody cuentaDTO dto) {
        ModelMapper m = new ModelMapper();
        cuenta myItem = m.map(dto, cuenta.class);
        myService.insert(myItem);
    }


    // Retrieve an items by ID from table
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable("id")Long id){
        myService.delete(id);
    }


    @GetMapping
    public List<cuentaDTO> listar(){
        return myService.list().stream().map(x -> {
            ModelMapper m = new ModelMapper();
            return m.map(x, cuentaDTO.class);
        }).collect(Collectors.toList());
    }







}
