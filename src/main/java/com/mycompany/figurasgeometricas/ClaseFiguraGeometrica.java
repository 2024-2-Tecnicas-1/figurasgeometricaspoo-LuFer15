package com.mycompany.figurasgeometricas;

public class ClaseFiguraGeometrica {
    private String nombre;
    private String color;

    public ClaseFiguraGeometrica(String nombre, String color){
        this.nombre=nombre;
        this.color=color;
    }

    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color=color;
    }
     //Complejidad temporal: O(1) Tiempo constante
    public double obtenerArea() {
        return 0;
    }

    //Complejidad temporal: O(1) Tiempo constante
    public double obtenerPerimetro() {
        return 0;
    }
    
}
