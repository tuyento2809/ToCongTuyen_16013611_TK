package com.example.student.tocongtuyen_16013611.bai1;

public class Game {
    private String name;
    private double gia;
    private String nuoc;

    public Game(String name, double gia, String nuoc) {
        this.name = name;
        this.gia = gia;
        this.nuoc = nuoc;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public String getNuoc() {
        return nuoc;
    }

    public void setNuoc(String nuoc) {
        this.nuoc = nuoc;
    }
}
