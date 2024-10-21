package com.mycompany.figurasgeometricas;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("Ingrese el nombre de la figura");
        String nombre = sc.nextLine();

        System.out.println("Ingrese el color de la figura");
        String color = sc.nextLine();

        System.out.println("Ingrese el tipo de figura:\n1. Circulo\n2. Rectángulo\n3. Triángulo");
        int Opcion = sc.nextInt();

        ClaseFiguraGeometrica figura  =null;

        switch (Opcion) {
            case 1: System.out.println("Ingrese el radio del circulo");
                double radio = sc.nextDouble();
                figura = new ClaseCirculo(nombre, color, radio);
                break;
            
            case 2: System.out.println("Ingrese el valor del lado 1 del rectángulo");
                double lado1 = sc.nextDouble();
                System.out.println("Ingrese el valor del lado 2 del rectángulo");
                double lado2= sc.nextDouble();
                figura = new ClaseRectangulo(nombre, color, lado1, lado2);
                break;

            case 3: System.out.println("Ingrese el valor de la base del triángulo");
                double base = sc.nextDouble();
                System.out.println("Ingrese el valor de la altura del triángulo");
                double altura = sc.nextDouble();
                figura = new ClaseTriangulo(nombre, color, base, altura);
                break;

            default:
                    System.out.println("No valido");
                    break;
        }   
        if (figura != null) {
            System.out.println("Área: " + figura.obtenerArea());
            System.out.println("Perímetro: " + figura.obtenerPerimetro());
        }

        sc.close();
    }
}
