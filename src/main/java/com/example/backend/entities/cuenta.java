package com.example.backend.entities;
import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.*;

import java.io.Serializable;

@Entity
@Table(name = "cuenta", uniqueConstraints = {@UniqueConstraint(columnNames = {"user_id", "moneda"})})
public class cuenta implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_cuenta;
    private String moneda;

    @JsonBackReference
    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private usuarios user;

    public Long getId() {
        return id_cuenta;
    }

    public void setId(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getMoneda() {
        return moneda;
    }

    public void setRol(String moneda) {
        this.moneda = moneda;
    }

    public usuarios getUser() {
        return user;
    }

    public void setUser(usuarios user) {
        this.user = user;
    }
}