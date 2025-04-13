package org.example.mijavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import java.io.IOException;
import static java.lang.System.*;

public class HelloController {

    @FXML
    private Label welcomeText;
    @FXML
    private Button contar;
    @FXML
    private Label contar_etiqueta;


    // Para una línea simple de codigo este metodo es el mejor.
    @FXML
    public void initialize(){
        Contador contador = new Contador();
        contar.setOnAction(e -> {
            contador.contar();
            out.println(contador.getContador());
            contar_etiqueta.setText(Integer.toString(contador.getContador()));
        });
    }

    // Si el botón tiene que hacer varias cosas.
    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Bienvenido a JavaFX Application!");
    }

    public void cambioPantalla2() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }

    public void pantallaPersona() throws IOException {
        HelloApplication.setRoot("persona-view");
    }
}