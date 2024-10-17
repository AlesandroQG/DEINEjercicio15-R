module com.alesandro.ejercicio15r {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.alesandro.ejercicio15r to javafx.fxml;
    exports com.alesandro.ejercicio15r;
}