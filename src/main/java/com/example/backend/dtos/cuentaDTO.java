package com.example.backend.dtos;


import java.util.Date;

public class cuentaDTO {
    private Long id_cuenta;

    private String moneda;
    //private usuarios usuarios;

    public Long getId_cuenta() {
        return id_cuenta;
    }

    public void setId_cuenta(Long id_cuenta) {
        this.id_cuenta = id_cuenta;
    }

    public String getMoneda(){
        return moneda;
    }

    public void setMoneda(String moneda){
        this.moneda=moneda;
    }


}
