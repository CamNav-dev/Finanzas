package com.example.backend.repositories;

import com.example.backend.entities.cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository<cuenta, Long> {

}
