package org.example.mijavafx;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class RepositorioPersonas {

    private static final ObservableList<Persona> PERSONAS = FXCollections.observableArrayList();

    public static ObservableList<Persona> getPersonas() {
        return PERSONAS;
    }

    public static void insertarPersonas(Persona persona){
        PERSONAS.add(persona);
    }
}