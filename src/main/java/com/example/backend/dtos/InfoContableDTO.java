package com.example.backend.dtos;
import com.example.backend.entities.usuarios;
import java.util.Date;

public class InfoContableDTO {
    private Long idInfoContable;
    private double valorP;
    private int dias;
    private double tasaEfectiva;
    private Date fechaInicio;
    private Date fechaFin;
    private usuarios usuarios;

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
