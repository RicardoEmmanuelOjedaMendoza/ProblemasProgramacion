import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){
  
    Scanner in = new Scanner(System.in);
   int fac = 0, z = fac, y = 0, x = 1;

   System.out.println("Ingrese Un Numero: ");
   fac = in.nextInt();
        if(fac<0){
                System.out.println("�No Hay Factorial De Un Numero Negativo!");
        } else if(fac==0){
                System.out.println("�El Numero Debe Ser Mayor A Cero!");
        }
        x = 1;
        while(x<z){
            y = fac = fac * x;
            System.out.println(y);
            x++;
        }
        System.out.println("El Factorial De "+z+" Es: "+y);
 }
} 

