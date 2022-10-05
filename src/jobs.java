
import java.io.Serializable;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */



/**
 *
 * @author NASA
 */
public class jobs implements Serializable{
    private double salary;
    private String nameOfJob;

    public jobs(double salary, String nameOfJob) {
        this.salary = salary;
        this.nameOfJob = nameOfJob;
    }

    public double getSalary() {
        return salary;
    }

    public String getNameOfJob() {
        return nameOfJob;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setNameOfJob(String nameOfJob) {
        this.nameOfJob = nameOfJob;
    }
    public boolean equalsJobs(jobs job){
       // System.out.println("compara Jobs salary "+this.salary+" "+ job.salary);
      //  System.out.println("compara Jobs nombre "+this.nameOfJob+" "+ job.nameOfJob);
        if (this.salary == job.salary && this.nameOfJob.equals(job.nameOfJob) ) return true;
        else return false;
    }
    
}
