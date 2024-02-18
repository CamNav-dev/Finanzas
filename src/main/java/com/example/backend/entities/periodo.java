package com.example.backend.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "periodo")
public class periodo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_periodo;
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;
    @Column(name = "valor_presente", nullable = false)
    private double valorP;
    @Column(name = "valor_futuro", nullable = false)
    private double valorF;
    @Column(name = "taza_efectiva_diaria", nullable = false)
    private double tazaEfectivaDiaria;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private Cuenta cuenta;

    public periodo() {
    }

    public periodo(Long id_periodo, Date fechaInicio, Date fechaFin, double valorP, double valorF, double tazaEfectivaDiaria, Cuenta cuenta) {
        this.id_periodo = id_periodo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.valorP = valorP;
        this.valorF = valorF;
        this.tazaEfectivaDiaria = tazaEfectivaDiaria;
        this.cuenta = cuenta;
    }

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

    public Cuenta getCuenta() {
        return cuenta;
    }

    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
}