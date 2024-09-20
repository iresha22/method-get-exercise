package com.getcompeleteexercise.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


public class User {
    // fields
    private String name;
    private String provincia;
    private String saluto;

    // costruttore
    public User(){

    }

    // construttore con tutti parametri


    public User(String name, String provincia,String saluto) {
        this.provincia = provincia;
        this.name = name;
        this.saluto = saluto;
    }
// getter and setter
    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   public String getSaluto(){
        return saluto;
   }
   public void setSaluto(String saluto){
        this.saluto = saluto;
   }
}
