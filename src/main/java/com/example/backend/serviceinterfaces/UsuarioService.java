package com.example.backend.serviceinterfaces;
import com.example.backend.entities.usuarios;

import java.util.List;

public interface UsuarioService {
    void insert(usuarios usuarios);
    void delete(Long id);
    usuarios listId(Long id);
    List<usuarios> list();
}
