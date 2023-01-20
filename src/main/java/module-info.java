module com.dam.reports {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    //requires net.sf.jasperreports;
    requires net.sf.jasperreports;
    opens com.dam.reports to javafx.fxml;
    exports com.dam.reports;
}
