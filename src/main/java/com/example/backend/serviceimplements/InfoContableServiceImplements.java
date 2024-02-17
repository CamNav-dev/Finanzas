package com.example.backend.serviceimplements;

import com.example.backend.entities.infocontable;
import com.example.backend.repositories.InfoContableRepository;
import com.example.backend.serviceinterfaces.InfoContableInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoContableServiceImplements implements InfoContableInterface {
    @Autowired
    private InfoContableRepository myR;
    @Override
    public void insert(infocontable infocontable) {
        myR.save(infocontable);
    }

    @Override
    public void delete(long id) {
        myR.deleteById(id);
    }

    @Override
    public infocontable listId(long id) {
        return myR.findById(id).orElse(new infocontable());
    }

    @Override
    public List<infocontable> list() {
        return myR.findAll();
    }
}
