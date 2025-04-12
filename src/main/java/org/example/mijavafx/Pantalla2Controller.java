package org.example.mijavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;

import java.io.IOException;

public class Pantalla2Controller {

    @FXML
    private TextField tipo;

    @FXML
    private TextField  marca;

    @FXML
    private TextField precio;


    public void irAlInicio() throws IOException {
        HelloApplication.setRoot("hello-view");
    }

    public void guardar() {
        String tipo_calzado = tipo.getText();
        String marca_calzado = marca.getText();
        double precio_calzado = Double.parseDouble(precio.getText());

        Calzado calzado = new Calzado(tipo_calzado, marca_calzado, precio_calzado);

        System.out.println("Calzado creado: " + calzado.getTipo() + ", " + calzado.getMarca() + ". Precio : " + calzado.getPrecio() + "€.");

        //para que se limpie los fields del formulario
        tipo.clear();
        marca.clear();
        precio.clear();
    }
}