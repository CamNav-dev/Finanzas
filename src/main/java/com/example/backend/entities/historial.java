package com.example.backend.entities;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "historial")
public class historial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idHistorial;
    @Column(name = "Usuario", nullable = false)
    private String tipo;
    @Column(name = "monto", nullable = false)
    private double monto;
    @Column(name = "fecha", nullable = false)
    private Date fecha;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private usuarios usuarios;

    public historial() {
    }

    public historial(Long idHistorial, String tipo, double monto, Date fecha, com.example.backend.entities.usuarios usuarios) {
        this.idHistorial = idHistorial;
        this.tipo = tipo;
        this.monto = monto;
        this.fecha = fecha;
        this.usuarios = usuarios;
    }

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
