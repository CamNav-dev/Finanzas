package com.example.backend.serviceimplements;

import com.example.backend.entities.usuarios;
import com.example.backend.repositories.UsuariosRepository;
import com.example.backend.serviceinterfaces.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuariosServiceImplements implements UsuarioService {
    @Autowired
    private UsuariosRepository myRepository;
    @Override
    public void insert(usuarios usuarios) {
        myRepository.save(usuarios);
    }

    @Override
    public void delete(Long id) {
        myRepository.deleteById(id);
    }

    @Override
    public usuarios listId(Long id) {
        return myRepository.findById(id).orElse(new usuarios());
    }

    @Override
    public List<usuarios> list() {
        return myRepository.findAll();
    }
}
