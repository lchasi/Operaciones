
package operaciones;

import java.util.Scanner;

public class Operaciones {

    
    public static void main(String[] args) {
        
    
   Scanner entrada = new Scanner  (System.in);
        int numeroa,numerob,numeroc, numero4,numero5,numero6,suma,resta,multiplicacion,division;
        
        System.out.println( "ingrese el valor de a  " );
        numeroa = entrada.nextInt ();
        
        System.out.println( "ingrese el valor de b  " );
        numerob = entrada.nextInt ();
        
       System.out.println( "ingrese el valor de c  " );
        numeroc = entrada.nextInt ();
        
        System.out.println( "ingrese el valor de 4  " );
        numero4 = entrada.nextInt ();
        
        System.out.println( "ingrese el valor de la resta   " );
        numero5 = entrada.nextInt ();
        
        System.out.println( "ingrese el valor de la resta   " );
        numero6 = entrada.nextInt ();
        
        suma = numeroa+numerob+numeroc;
        multiplicacion = suma*numero4;
        resta = numero5-numero6;
        division= multiplicacion/resta;
        
        
                
        
        
        
        System.out.println( "El resultado de la suma es  "+suma );
        System.out.println( "El resultado de la multiplicacion es  "+multiplicacion );
        System.out.println( "El resultado de la resta es  " +resta );
        System.out.println( "El resultado de la division y formula es  "+division );
    }  
        
                
   
}
