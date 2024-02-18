package com.example.backend.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import javax.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class usuarios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "usuario", nullable = false)
    private String username;
    @Column(name = "contraseña", nullable = false)
    private String password;
    @Column(name = "correo", nullable = false)
    private String email;
    @Column(name = "nombre", nullable = false)
    private String nombre;
    private Boolean enabled;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    private List<roles> roles;

    public usuarios() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public List<roles> getRoles() {
        return roles;
    }

    public void setRoles(List<roles> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
