package com.example.backend.repositories;

import com.example.backend.entities.periodo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PeriodoRepository extends JpaRepository<periodo, Long> {
}
