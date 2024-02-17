package com.example.backend.entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "info_contable")
public class infocontable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInfoContable;
    @Column(name = "valor_presente", nullable = false)
    private double valorP;
    @Column(name = "plazo_dias", nullable = false)
    private int dias;
    @Column(name = "taza_efectiva", nullable = false)
    private double tasaEfectiva;
    @Column(name = "fecha_inicio", nullable = false)
    private Date fechaInicio;
    @Column(name = "fecha_fin", nullable = false)
    private Date fechaFin;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private usuarios usuarios;

    public infocontable() {
    }

    public infocontable(Long idInfoContable, double valorP, int dias, double tasaEfectiva, Date fechaInicio, Date fechaFin, com.example.backend.entities.usuarios usuarios) {
        this.idInfoContable = idInfoContable;
        this.valorP = valorP;
        this.dias = dias;
        this.tasaEfectiva = tasaEfectiva;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.usuarios = usuarios;
    }

    public Long getIdInfoContable() {
        return idInfoContable;
    }

    public void setIdInfoContable(Long idInfoContable) {
        this.idInfoContable = idInfoContable;
    }

    public double getValorP() {
        return valorP;
    }

    public void setValorP(double valorP) {
        this.valorP = valorP;
    }

    public int getDias() {
        return dias;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public double getTasaEfectiva() {
        return tasaEfectiva;
    }

    public void setTasaEfectiva(double tasaEfectiva) {
        this.tasaEfectiva = tasaEfectiva;
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

    public com.example.backend.entities.usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(com.example.backend.entities.usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
