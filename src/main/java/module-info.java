module com.dam.interfacesud8 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javahelp;
    requires javafx.swing;
    requires javafx.web;
    requires javafx.media;
    
    opens com.dam.interfacesud8 to javafx.fxml;
    exports com.dam.interfacesud8;
}
