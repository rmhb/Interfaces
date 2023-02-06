module com.dam.intefaceesud7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires jasperreports;

    opens com.dam.intefaceesud7 to javafx.fxml;
    exports com.dam.intefaceesud7;
}
