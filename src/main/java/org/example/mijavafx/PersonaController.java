package org.example.mijavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import lombok.Getter;
import java.io.IOException;
import static java.lang.System.*;

@Getter
public class PersonaController {

    @FXML
    private TextField nombre;

    @FXML
    private TextField edad;

    @FXML
    private TextField ciudad;


    @FXML
    private TableView<Persona> tablaPersonas;

    @FXML
    private TableColumn<Persona, String> columnaNombre;

    @FXML
    private TableColumn<Persona, Integer> columnaEdad;

    @FXML
    private TableColumn<Persona, String> columnaCiudad;

    private final ObservableList<Persona> listaPersonas = FXCollections.observableArrayList();


    @FXML
    public void initialize() {

        // Enlazar columnas con propiedades del objeto Persona
        columnaNombre.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getNombre()));
        columnaEdad.setCellValueFactory(data -> new javafx.beans.property.SimpleIntegerProperty(data.getValue().getEdad()).asObject());
        columnaCiudad.setCellValueFactory(data -> new javafx.beans.property.SimpleStringProperty(data.getValue().getCiudad()));

        // Asignar la lista al TableView
        tablaPersonas.setItems(RepositorioPersonas.getPersonas());
    }

    @FXML
    public void guardarPersona() {

        String nombreIntroducido = nombre.getText();
        String ciudadIntroducida = ciudad.getText();
        int edadIntroducida = 0;

        try {
            edadIntroducida = Integer.parseInt(edad.getText());
        } catch (NumberFormatException e) {
            out.println("Edad Inválida");
        }

        Persona persona = new Persona(nombreIntroducido, edadIntroducida, ciudadIntroducida);
        RepositorioPersonas.insertarPersonas(persona);
        out.println("Persona creada: " + persona.getNombre() + ", " + persona.getEdad() + ", " + persona.getCiudad());

        // Para limpiar los filds de las celdad
        nombre.clear();
        edad.clear();
        ciudad.clear();
    }

    public void cambioPantalla2() throws IOException {
        HelloApplication.setRoot("pantalla2");
    }

    public void irAlInicio() throws IOException {
        HelloApplication.setRoot("hello-view");
    }
}