package com.project;

public class Brand {
    private String brand;
    private char id;

    public Brand(String brand, char id){
        this.brand = brand;
        this.id = id;
    }

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public char getId(){
        return id;
    }

    public void setId(char id){
        this.id =id;
    }


    public String toString(){
        return "Brand [brand=" + brand + ", id=" + id + "]";
    }
}
