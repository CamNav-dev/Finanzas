package com.example.backend.serviceimplements;

import com.example.backend.entities.cuenta;
import com.example.backend.entities.periodo;
import com.example.backend.repositories.CuentaRepository;
import com.example.backend.serviceinterfaces.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CuentaServiceImplements implements CuentaService {
    @Autowired
    private CuentaRepository cu;

    @Override
    public void insert(cuenta cuenta) {
        cu.save(cuenta);
    }

    @Override
    public void delete(long id) {
        cu.deleteById(id);
    }
    @Override
    public cuenta listId(long id) {
        return cu.findById(id).orElse(new cuenta());
    }
    @Override
    public List<cuenta> list() {
        return cu.findAll();
    }

}
