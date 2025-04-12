package org.example.mijavafx;

import lombok.Getter;

@Getter
public class Calzado {

    private String tipo;
    private String marca;
    private double precio;

    public Calzado(String tipo, String marca, double precio){
        this.tipo=tipo;
        this.marca=marca;
        this.precio=precio;
    }

}