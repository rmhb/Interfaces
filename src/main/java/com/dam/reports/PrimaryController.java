package com.dam.reports;

import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.fxml.FXML;
import net.sf.jasperreports.engine.JRException;

import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.export.JRPdfExporter;



public class PrimaryController {

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    
    }

    @FXML
    public void _imprimir() {
        Connection conn;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
            Map<String, Object> map = new HashMap<>();
            
            map.put("headding", "REPORT FROM DATABASE CONNECTION");//parameter name should be like it was named inside your report.
            new GenerarInforme().genarateReport(GenerarInforme.REPORT1, map, conn);
        } catch (SQLException ex) {
            System.out.println("Imprimir - Cagada SQL");
        }

    }
   @FXML 
   public void _imprimirOP2(){
        Connection conn;
        // Login con bbagg6@tmall.com   vlVO3U
        try {

            conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");

            PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas");
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Nombre y apellidos " + rs.getString(2) + " " + rs.getString(3));
                System.out.println("Email " + rs.getString(4));

            } else {
                System.out.println("Error");
            }
            //JasperReport reporte = (JasperReport) JRLoader.loadObject("informes/report1.jasper");
          //  JasperReport jr = (JasperReport) JRLoader.loadObject("C:\\Users\\NASA\\Documents\\NetBeansProjects\\reports\\src\\main\\resources\\informes\\report1.jasper");
            JasperReport jr = (JasperReport) JRLoader.loadObject(new File("C:\\Users\\NASA\\Documents\\NetBeansProjects\\reports\\src\\main\\resources\\informes\\EjemploReport1.jasper"));
            //                https://jossjack.wordpress.com/2014/06/15/jasperreport-ireport-en-netbeans/
            
            
            JasperPrint jasperPrint = JasperFillManager.fillReport(jr, null, conn);
            JRExporter exporter = new JRPdfExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
            exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte_jackPDF.pdf"));
            exporter.exportReport();

        } catch (JRException ex) {
            System.out.println("OP2 - Cagada Jasper");
            ex.printStackTrace();
        } catch (SQLException ex) {
            System.out.println("OP2 - Cagada  SQL");
        }
   }
    
    
   
    private void _imprimir2(){
       Connection conn;
        try {
            // Parece que existe un plugin para directamente crear instaladores.... a saber si esta chulo
            // Tutorial de jasperreport que viene de ejava https://community.jaspersoft.com/wiki/jasperreports-library-tutorial
            //https://jasperreports.sourceforge.net/api/net/sf/jasperreports/engine/package-summary.html
            // Login con bbagg6@tmall.com   vlVO3U
//            try {
//                conn = DriverManager.getConnection("jdbc:mysql://super.choto.es:3306/alu_rental", "unalumno", "soyunalumno2022");
JasperReport reporte = (JasperReport) JRLoader.loadObject(App.class.getResource("informes/report1.jasper"));
//                JasperReport reporte = (JasperReport) JRLoader.loadObject("informes/report1.jasper");
//                
////                https://jossjack.wordpress.com/2014/06/15/jasperreport-ireport-en-netbeans/
//                Class.forName("com.mysql.jdbc.Driver");
//                Connection conexion = DriverManager.getConnection("jdbc:mysql://192.168.1.6:3306/PRUEBA", "jossjack", "123456");
//                JasperReport reporte = (JasperReport) JRLoader.loadObject("jack.jasper");
//                JasperPrint jasperPrint = JasperFillManager.fillReport(reporte, null, conexion);
//                JRExporter exporter = new JRPdfExporter();
//                exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
//                exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("reporte_jackPDF.pdf"));
//                exporter.exportReport();
//
//
//                PreparedStatement stmt = conn.prepareStatement("SELECT * FROM personas where email = ?");
//                stmt.setString(1, _usu.getText());
//                ResultSet rs = stmt.executeQuery();
//                if(rs.next()){
//                    System.out.println("Nombre y apellidos " + rs.getString(2)+" "+ rs.getString(3));
//                    System.out.println("Email " + rs.getString(4));
//                    try {
////                        App.setRoot("/views/loadGif");
//                        App.setRoot("/views/rentCar");
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }    
//                }else{
//                    System.out.println("Cagada");
//                }
//
//
//                
//            } catch (SQLException ex) {
//                 ex.printStackTrace();
//            }
        } catch (JRException ex) {
            Logger.getLogger(PrimaryController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
