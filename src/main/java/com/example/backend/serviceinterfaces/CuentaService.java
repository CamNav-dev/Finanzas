package com.example.backend.serviceinterfaces;
import com.example.backend.entities.cuenta;


import java.util.List;

public interface CuentaService {

    void insert(cuenta cuenta);
    void delete(long id);
    cuenta listId(long id);
    List<cuenta> list();
}
