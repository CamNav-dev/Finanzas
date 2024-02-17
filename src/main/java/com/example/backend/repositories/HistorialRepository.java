package com.example.backend.repositories;

import com.example.backend.entities.historial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialRepository extends JpaRepository<historial, Long> {
}
