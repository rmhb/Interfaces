module com.dam.rental {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
//    requires java.sql;
//    requires mysql.connector.java;

    opens com.dam.rental to javafx.fxml;
    exports com.dam.rental;
}
