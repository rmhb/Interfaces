
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author NASA
 */
public class Empleado implements Serializable {
    private String name;
    private String apellidos;
    private jobs job;
    private int numTrabajador;

    public void setName(String name) {
        this.name = name;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setJob(jobs job) {
        this.job = job;
    }

    public void setNumTrabajador(int numTrabajador) {
        this.numTrabajador = numTrabajador;
    }

    public String getName() {
        return name;
    }

    public String getApellidos() {
        return apellidos;
    }

    public jobs getJob() {
        return job;
    }

    public int getNumTrabajador() {
        return numTrabajador;
    }

    public Empleado(String name, String apellidos, jobs job, int numTrabajador) {
        this.name = name;
        this.apellidos = apellidos;
        this.job = job;
        this.numTrabajador = numTrabajador;
    }
    
}
