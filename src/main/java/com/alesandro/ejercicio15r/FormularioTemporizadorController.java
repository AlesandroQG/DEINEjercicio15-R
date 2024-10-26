package com.alesandro.ejercicio15r;

import com.alesandro.ejercicio15q.Temporizador;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Clase que controla los eventos de la ventana
 */
public class FormularioTemporizadorController implements Initializable {
    @FXML // fx:id="temporizador"
    private Temporizador temporizador; // Value injected by FXMLLoader

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
        // Temporizador
        if (temporizador.setSegundos(20)) {
            temporizador.iniciar();
            temporizador.finProperty().addListener(new ChangeListener<Object>() {
                @Override
                public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
                    //código con las instrucciones a realizar
                    deshabilitarBotones();
                }
            });
        } else {
            deshabilitarBotones();
            alerta("No se ha podido iniciar el temporizador");
        }
    }

    /**
     * Función que se ejecuta cuando se pulsa alguno de los botones de enviar del formulario
     *
     * @param event
     */
    @FXML
    void enviar(ActionEvent event) {
        confirmacion("Enviado");
    }

    /**
     * Función que deshabilita los botones de enviar
     */
    public void deshabilitarBotones() {
        btnEnviar1.setDisable(true);
        btnEnviar2.setDisable(true);
    }

    /**
     * Función que muestra un mensaje de alerta al usuario
     *
     * @param texto contenido de la alerta
     */
    public void alerta(String texto) {
        Alert alerta = new Alert(Alert.AlertType.ERROR);
        alerta.setHeaderText(null);
        alerta.setTitle("Error");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

    /**
     * Función que muestra un mensaje de confirmación al usuario
     *
     * @param texto contenido del mensaje
     */
    public void confirmacion(String texto) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION);
        alerta.setHeaderText(null);
        alerta.setTitle("Info");
        alerta.setContentText(texto);
        alerta.showAndWait();
    }

}