package com.test;

public class Basicos {

	public static void numericos() {

        //Estos son los tipos básicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignación de valores a las variables de tipos básicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos básicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }
    public static void cadenas() {
    	String cadena;
    	
    	cadena = "Hola Mundo";
    	
    	System.out.println(cadena);
    }
	public static void logicos () {
		boolean logico;
		
		logico = false;
		
		
		if (logico == true) {
			System.out.println("El resultado es verdadero.");
		}
		else {
			System.out.println("El resultado es falso.");
		}
	}
	public static void main(String[] args) {
	        numericos();
	        cadenas();
	        logicos();
	}
}
