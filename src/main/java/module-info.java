module com.dam.rental {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires de.jensd.fx.glyphs.commons;
    requires de.jensd.fx.glyphs.materialdesignicons;
    requires de.jensd.fx.glyphs.fontawesome;
    requires java.sql;
//    requires mysql.connector.java;
    requires javafx.base;
    requires javafx.graphics;
    requires org.json;

    opens com.dam.rental to javafx.fxml;
    opens com.dam.rental.Models to javafx.base; // Esto es para solucionar la parte de que lo abra a la base
    exports com.dam.rental;
    exports com.dam.rental.Models;
}
