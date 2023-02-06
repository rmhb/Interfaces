package com.dam.intefaceesud7;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import javafx.fxml.FXML;

public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }
    @FXML
    private void informeMarcas() {
        Connection conn;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
            Map<String, Object> map = new HashMap<>();
            map.put("headding", "REPORT FROM DATABASE CONNECTION");//parameter name should be like it was named inside your report.
            new GenerarInforme("marcas.pdf", "Marcas.jasper").genReportPDF(map, conn);
        } catch (SQLException ex) {
            System.out.println("Imprimir - Cagada SQL");
        }
    }
}
