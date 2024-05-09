package com.project;

public class SPBU {
    private char id;
    private Brand brand;
    private String alamat;
    private Bensin bensin;

    public SPBU(char id, Brand brand, Bensin bensin, String alamat){
        this.id = id;
        this.brand = brand;
        this.bensin = bensin;
        this.alamat = alamat;
    }

    public char getId(){
        return id;
    }

    public Brand getBrand(){
        return brand;
    }

    public Bensin getBensin(){
        return bensin;
    }

    public String getAlamat(){
        return alamat;
    }

    public void displayStock(){
        System.out.println("Stock bensin di SPBU" + id + ":" + bensin.getStock());
    }

    public boolean login(){
        return true;
    }

    public String toString(){
        return "SPBU [id='+id+',brand='+brand +', alamat='+ alamat +',bensin='+bensin +']";
    }
}
