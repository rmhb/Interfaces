module com.dam.holafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.dam.holafx to javafx.fxml;
    exports com.dam.holafx;
}
