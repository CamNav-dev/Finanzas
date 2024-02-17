package com.example.backend.serviceinterfaces;

import com.example.backend.entities.historial;

import java.util.List;

public interface HistorialInterface {
    void insert(historial historial);
    void delete(long id);
    historial listId(long id);
    List<historial> list();
}
