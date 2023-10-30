
package ejercicios_bucles;

import java.util.Scanner;
public class Ejercicio20 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base;
        int exponente;
        int resultado=1;
        System.out.println("Introduce una base: ");
         base = sc.nextInt();
        System.out.println("Introduce un exponente: ");
         exponente = sc.nextInt();
            if(exponente<0){
            base=1/base;            
                           }
        for(int contador=1;contador<=exponente;contador++){
        resultado = resultado*base;
                                                          } 
       System.out.println("El resultado de la potencia "+resultado); 
                                            }
                          }

    

