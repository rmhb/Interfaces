module com.dam.fxejemplo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dam.fxejemplo to javafx.fxml;
    exports com.dam.fxejemplo;
}
