module com.alesandro.ejercicio15r {
    requires javafx.fxml;
    requires com.alesandro.ejercicio15q;
    requires javafx.controls;


    opens com.alesandro.ejercicio15r to javafx.fxml;
    exports com.alesandro.ejercicio15r;
}