package ies.Pureba_1;

public class P_Prueba1 {

	public static void main(String[] args) {
		double a = 15.5;
        double b = 4.0;

        
        System.out.println("--- Resultados de la Calculadora ---");
        System.out.println("Suma: " + a + " + " + b + " = " + sumar(a, b));
        System.out.println("Resta: " + a + " - " + b + " = " + restar(a, b));
        System.out.println("Multiplicación: " + a + " * " + b + " = " + multiplicar(a, b));
    }

    
    public static double sumar(double n1, double n2) {
        return n1 + n2;
    }

    
    public static double restar(double n1, double n2) {
        return n1 - n2;
    }

    
    public static double multiplicar(double n1, double n2) {
        return n1 * n2;
    }
    
    public static double media(double n1 , double n2) {
    	return(n1+n2)/2;
    }


	}


