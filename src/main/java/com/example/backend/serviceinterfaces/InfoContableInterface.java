package com.example.backend.serviceinterfaces;

import com.example.backend.entities.infocontable;

import java.util.List;

public interface InfoContableInterface {
    void insert(infocontable infocontable);
    void delete(long id);
    infocontable listId(long id);
    List<infocontable> list();
}
