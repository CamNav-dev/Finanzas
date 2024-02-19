package com.example.backend.dtos;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.util.Date;
import com.example.backend.entities.cuenta;

public class PeriodoDTO {
    private Long id_periodo;
    private Date fechaInicio;
    private Date fechaFin;
    private double valorP;
    private double valorF;
    private double tazaEfectivaDiaria;
    private cuenta cuenta;

    public Long getId_periodo() {
        return id_periodo;
    }

    public void setId_periodo(Long id_periodo) {
        this.id_periodo = id_periodo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public double getValorP() {
        return valorP;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public double getValorF() {
        return valorF;
    }

    public void setValorF(double valorF) {
        this.valorF = valorF;
    }

    public double getTazaEfectivaDiaria() {
        return tazaEfectivaDiaria;
    }

    public void setTazaEfectivaDiaria(double tazaEfectivaDiaria) {
        this.tazaEfectivaDiaria = tazaEfectivaDiaria;
    }

    public cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(cuenta cuenta) {
        this.cuenta = cuenta;
    }
}
