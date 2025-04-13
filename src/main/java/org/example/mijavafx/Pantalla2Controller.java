package org.example.mijavafx;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import java.io.IOException;
import static java.lang.System.*;

public class Pantalla2Controller {

    @FXML
    private TextField tipo;

    @FXML
    private TextField  marca;

    @FXML
    private TextField precio;

    @FXML
    private void guardar() {

        String tipo_calzado;
        String marca_calzado;
        double precio_calzado;

        tipo_calzado = tipo.getText();
        marca_calzado = marca.getText();
        precio_calzado = Double.parseDouble(precio.getText());

        Calzado calzado = new Calzado(tipo_calzado, marca_calzado, precio_calzado);

        out.println("Calzado creado: " + calzado.getTipo() + ", " + calzado.getMarca() + ". Precio : " + calzado.getPrecio() + "€.");

        //para que se limpie los fields del formulario
        tipo.clear();
        marca.clear();
        precio.clear();
    }

    public void irAlInicio() throws IOException {
        HelloApplication.setRoot("hello-view");
    }

    public void pantallaPersona() throws IOException {
        HelloApplication.setRoot("persona-view");
    }
}