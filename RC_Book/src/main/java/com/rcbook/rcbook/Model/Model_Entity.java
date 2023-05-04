package com.rcbook.rcbook.Model;



import java.time.Year;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="RC_Book")
public class Model_Entity {

    @Id
    @Column(name="Vehicle_number")
    private String Vehicle_number;

    @Column(name="Owner_name")
    private String Owner_name;
    
    @Column(name="Address")
    private String Addres;

    @Column(name="Makeer_name")
    private String Makeer_name;
    
    @Column(name="Model_name")
    private String Model_name;

    @Column(name="Model_Year")
    private Year  Model_Year;




    
    @Override
    public String toString() {
        return "Model_Entity [Vehicle_number=" + Vehicle_number + ", Owner_name=" + Owner_name + ", Addres=" + Addres
                + ", Makeer_name=" + Makeer_name + ", Model_name=" + Model_name + ", Model_Year=" + Model_Year + "]";
    }

    public Model_Entity() {
    }

    public Model_Entity(String vehicle_number, String owner_name, String addres, String makeer_name, String model_name,
            Year model_Year) {
        Vehicle_number = vehicle_number;
        Owner_name = owner_name;
        Addres = addres;
        Makeer_name = makeer_name;
        Model_name = model_name;
        Model_Year = model_Year;
    }

    public String getVehicle_number() {
        return Vehicle_number;
    }

    public void setVehicle_number(String vehicle_number) {
        Vehicle_number = vehicle_number;
    }

    public String getOwner_name() {
        return Owner_name;
    }

    public void setOwner_name(String owner_name) {
        Owner_name = owner_name;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String addres) {
        Addres = addres;
    }

    public String getMakeer_name() {
        return Makeer_name;
    }

    public void setMakeer_name(String makeer_name) {
        Makeer_name = makeer_name;
    }

    public String getModel_name() {
        return Model_name;
    }

    public void setModel_name(String model_name) {
        Model_name = model_name;
    }

    public Year getModel_Year() {
        return Model_Year;
    }

    public void setModel_Year(Year model_Year) {
        Model_Year = model_Year;
    }




    

   

    



    

   
    
}
