import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //Ciclo while
        //1.Variable de control
        //while (/*2.Expresion logica */) {
            //3.Actualizar valor de la variable de control
        //}
        //Ciclo do ... while
        //1.Variable de control
        //do {
            //2.Actualizar valor de la variable de control
        //} while (/*3.Expresion logica */);

        //Ciclo For
        //En este caso, siempre se conoce la cantidad de
        //iteraciones o repeticiones.
        //1.Variable de control;expresion logica;actualizacion de la variable de control
        Scanner lector = new Scanner(System.in);
        System.out.print("Hasta que Tabla de multiplicar: ");
        byte tabla = lector.nextByte();
        
        while (tabla > 50) {
            System.out.println("Valor demasiado alto.");
            System.out.print("Hasta que Tabla de multiplicar: ");
            tabla = lector.nextByte();
        }
        for (int j = 1; j <= tabla; j++) { //Es para pasar de una tabla a otra
            for (int i = 1; i <= 12; i++) {
                System.out.println(j + " x " + i + " = " + j*i);
            }
            System.out.println(":::::::::::::::");
        }

        lector.close();

















    }
}
