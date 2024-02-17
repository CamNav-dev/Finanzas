package com.example.backend.serviceimplements;

import com.example.backend.entities.historial;
import com.example.backend.repositories.HistorialRepository;
import com.example.backend.serviceinterfaces.HistorialInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HistorialServiceImplements implements HistorialInterface {
    @Autowired
    private HistorialRepository myR;


    @Override
    public void insert(historial historial) {
        myR.save(historial);
    }

    @Override
    public void delete(long id) {
        myR.deleteById(id);
    }

    @Override
    public historial listId(long id) {
        return myR.findById(id).orElse(new historial());
    }

    @Override
    public List<historial> list() {
        return myR.findAll();
    }
}
