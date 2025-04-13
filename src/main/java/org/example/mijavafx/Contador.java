package org.example.mijavafx;

import lombok.Getter;

@Getter
public class Contador {

    private int contador;

    public Contador(){

    }

    public void contar(){
        contador++;
    }

}