package com.example.backend.dtos;
import com.example.backend.entities.usuarios;
import java.util.Date;

public class HistorialDTO {
    private Long idHistorial;
    private String tipo;
    private double monto;
    private Date fecha;
    private usuarios usuarios;

    public Long getIdHistorial() {
        return idHistorial;
    }

    public void setIdHistorial(Long idHistorial) {
        this.idHistorial = idHistorial;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public com.example.backend.entities.usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(com.example.backend.entities.usuarios usuarios) {
        this.usuarios = usuarios;
    }
}
