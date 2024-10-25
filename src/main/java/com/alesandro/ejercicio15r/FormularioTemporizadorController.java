package com.alesandro.ejercicio15r;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla los eventos de la ventana
 */
public class FormularioTemporizadorController implements Initializable {

    @FXML // fx:id="btnEnviar1"
    private Button btnEnviar1; // Value injected by FXMLLoader

    @FXML // fx:id="btnEnviar2"
    private Button btnEnviar2; // Value injected by FXMLLoader

    /**
     * Función que se ejecuta cuando se carga la ventana
     *
     * @param url
     * @param resourceBundle
     */
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //
    }

    /**
     * Función que deshabilita los botones de enviar
     */
    public void deshabilitarBotones() {
        btnEnviar1.setDisable(true);
        btnEnviar2.setDisable(true);
    }

}