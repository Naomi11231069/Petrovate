package com.project;

public class Bensin{
    private char id;
    private String nama;
    private Brand brand;
    private double stock;
    
    public Bensin(char id, String nama, Brand brand, Double stock){
        this.id = id;
        this.nama = nama;
        this.brand = brand;
        this.stock = stock;
    }

    public char getId(){
        return id;
    }

    public void setId(char id){
        this.id = id;
    }

    public String getNama(){
        return nama;
    }

    public void setnama(String nama){
        this.nama = nama;
    }

    public Brand getBrand(){
        return brand;
    }

    public double getStock(){
        return stock;
    }

    public void setStock(double stock){
        this.stock = stock;
    }

    public String toString(){
        return "Bensin[id=" + id +", nama=" + nama +",brand=" + brand +", stock=" + stock + "]";
    }
}