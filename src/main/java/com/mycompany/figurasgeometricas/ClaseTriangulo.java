package com.mycompany.figurasgeometricas;


public class ClaseTriangulo extends ClaseFiguraGeometrica {
    private double base;
    private double altura;

    public ClaseTriangulo(String nombre, String color, double base, double altura){
        super(nombre, color);
        this.base=base;
        this.altura=altura;
    }

    public double getBase(){
        return base;
    }
    public void setBase(double base){
        this.base=base;
    }
    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura=altura;
    }

    @Override
    public double obtenerArea(){
        return (base*altura)/2;
    }
    
    @Override
    public double obtenerPerimetro(){
        double hipotenusa = Math.sqrt(base*base + altura*altura);
        return base+altura+hipotenusa;
    }
}


