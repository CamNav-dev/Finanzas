package com.example.backend.serviceimplements;

import com.example.backend.repositories.PeriodoRepository;
import com.example.backend.serviceinterfaces.PeriodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeriodoServiceImplements implements PeriodoService {
    @Autowired
    private PeriodoRepository pR;
}