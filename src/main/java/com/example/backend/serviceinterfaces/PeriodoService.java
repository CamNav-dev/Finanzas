package com.example.backend.serviceinterfaces;

import com.example.backend.entities.periodo;

import java.util.List;

public interface PeriodoService {
    void insert(periodo periodo);
    void delete(long id);
    periodo listId(long id);
    List<periodo> list();
}
