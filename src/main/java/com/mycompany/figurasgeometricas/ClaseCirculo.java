package com.mycompany.figurasgeometricas;

public class ClaseCirculo extends ClaseFiguraGeometrica {
    private double radio;

    public ClaseCirculo(String nombre, String color, double radio){
        super(nombre, color);
        this.radio=radio;
    }
    public double getRadio(){
        return radio;
    }
    public void setRadio(double radio){
        this.radio=radio;
    }

    @Override
    public double obtenerArea(){
        return Math.PI *radio*radio;
    }
    
    @Override
    public double obtenerPerimetro(){
        return 2 * Math.PI * radio;
    }
}
