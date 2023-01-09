module com.dam.raya_al {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.dam.raya_al to javafx.fxml;
    exports com.dam.raya_al;
}
