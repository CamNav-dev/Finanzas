package com.example.backend.serviceimplements;

import com.example.backend.entities.periodo;
import com.example.backend.repositories.PeriodoRepository;
import com.example.backend.serviceinterfaces.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PeriodoServiceImplements implements PeriodoService {
    @Autowired
    private PeriodoRepository pR;
    @Override
    public void insert(periodo periodo) {
        pR.save(periodo);
    }
    @Override
    public void delete(long id) {
        pR.deleteById(id);
    }
    @Override
    public periodo listId(long id) {
        return pR.findById(id).orElse(new periodo());
    }
    @Override
    public List<periodo> list() {
        return pR.findAll();
    }
}