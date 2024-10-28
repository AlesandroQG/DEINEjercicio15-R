module com.alesandro.ejercicio15r {
    requires javafx.fxml;
    requires javafx.controls;
    requires com.alesandro.ejercicio15q;


    opens com.alesandro.ejercicio15r to javafx.fxml;
    exports com.alesandro.ejercicio15r;
}