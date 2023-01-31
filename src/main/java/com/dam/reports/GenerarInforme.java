/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.dam.reports;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.ooxml.JRDocxExporter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.export.SimpleDocxReportConfiguration;
import net.sf.jasperreports.export.SimpleExporterInput;
import net.sf.jasperreports.export.SimpleOutputStreamExporterOutput;
import net.sf.jasperreports.export.SimplePdfExporterConfiguration;

/**
 *
 * @author NASA
 */
public class GenerarInforme {

    private String fich_salida;
    private String fich_jasper;
    private InputStream inputStreamJasper;

    public GenerarInforme(String fich_salida, String fich_jasper) {
        this.fich_salida = "./informesGenerados/"+fich_salida;
        this.fich_jasper =  "/informes/"+fich_jasper;
        this.inputStreamJasper = getClass().getResourceAsStream(this.fich_jasper);
    }

    public GenerarInforme() {
        super();
    }
            
    
    public static String OUT_PUT = "./informesGenerados/hola.docx";
    //public static String REPORT = "/informes/EjemploReport.jrxml";
    //public InputStream is = getClass().getResourceAsStream(REPORT);
    public String jasperFile = "/informes/EjemploReport1.jasper";
    public InputStream isJasper = getClass().getResourceAsStream(jasperFile);
    public String jasperFileAbsoluta = "C:\\Users\\NASA\\Documents\\NetBeansProjects\\reports\\src\\main\\resources\\informes\\EjemploReport.jasper";
    
    public void genReportPDF(Map<String, Object> map, Connection con){
        System.out.println("Jasper a leer "+this.fich_jasper);
          try {

            System.out.println("Cargando Input Stream Jasper");
            JasperReport jrc = (JasperReport) JRLoader.loadObject(this.inputStreamJasper );
           // Map<String, Object> parameters= new HashMap<>();
            System.out.println("Rellenando Informe");
            JasperPrint jp = JasperFillManager.fillReport(jrc, null, con);
            System.out.println("Exportando Informe a PDF");
          
            JRPdfExporter export = new JRPdfExporter();
            System.out.println("6");
            export.setExporterInput(new SimpleExporterInput(jp));
            System.out.println("5");
            export.setExporterOutput(new SimpleOutputStreamExporterOutput(new File( this.fich_salida)));
            System.out.println("4");
            SimplePdfExporterConfiguration config = new SimplePdfExporterConfiguration();
            System.out.println("3");
            export.setConfiguration(config);
            System.out.println("2");
            export.exportReport();
            System.out.println("1");
        } catch (JRException ex) {
            System.out.println("GenReport - Cagada al generar el Report");
            ex.printStackTrace();
        }
    }
    public void genReportParamPDF(Map<String, Object> map, Connection con) {
        System.out.println("Jasper a leer " + this.fich_jasper);
        try {

            System.out.println("Cargando Input Stream Jasper");
            JasperReport jrc = (JasperReport) JRLoader.loadObject(this.inputStreamJasper);
            // Map<String, Object> parameters= new HashMap<>();
            System.out.println("Rellenando Informe");
            JasperPrint jp = JasperFillManager.fillReport(jrc, map, con);
            System.out.println("Exportando Informe a PDF");

            JRPdfExporter export = new JRPdfExporter();
            System.out.println("6");
            export.setExporterInput(new SimpleExporterInput(jp));
            System.out.println("5");
            export.setExporterOutput(new SimpleOutputStreamExporterOutput(new File(this.fich_salida)));
            System.out.println("4");
            SimplePdfExporterConfiguration config = new SimplePdfExporterConfiguration();
            System.out.println("3");
            export.setConfiguration(config);
            System.out.println("2");
            export.exportReport();
            System.out.println("1");
        } catch (JRException ex) {
            System.out.println("GenReport - Cagada al generar el Report");
            ex.printStackTrace();
        }
    }

    //public URL urlJasper = this.getClass().getResource(REPORT);
    

    public void genarateReportDOCX( Map<String, Object> map, Connection con) {
        try {
            //InputStream is;

            //is = new FileInputStream(REPORT2);

            System.out.println("Load Jrxml");
           // JasperReport jr = JasperCompileManager.compileReport(is);
          //  JasperReport jr = JasperCompileManager.compileReport(JRXmlLoader.load(is));
            System.out.println("JRLoadere");
            JasperReport jrc = (JasperReport) JRLoader.loadObject(isJasper);
            Map<String, Object> parameters= new HashMap<String, Object>();
            //System.out.println(jrc);
            // Con parametros descomentar: 
            // JasperPrint jp = JasperFillManager.fillReport(jr, map, con);
            // Sin parametros dejar esta:
            System.out.println("JasperFill");
            JasperPrint jp = JasperFillManager.fillReport(jrc, null, con);
            // También podemos cargarlo a pelo desde la ruta absoluta
          //  JasperPrint jp = JasperFillManager.fillReport(jasperFileAbsoluta, parameters, con);
            System.out.println("Exporter");
            
            JRDocxExporter export = new JRDocxExporter();
            System.out.println("1");
            export.setExporterInput(new SimpleExporterInput(jp));
            System.out.println("2");
            export.setExporterOutput(new SimpleOutputStreamExporterOutput(new File(OUT_PUT)));
            System.out.println("3");
            SimpleDocxReportConfiguration config = new SimpleDocxReportConfiguration();
            System.out.println("4");
            export.setConfiguration(config);
            System.out.println("5");
            export.exportReport();
            System.out.println("fin");
        } catch (JRException ex) {
            System.out.println("Generar Informe - Cagada al generar el Report");
            ex.printStackTrace();
        }
    }

    
    
}
