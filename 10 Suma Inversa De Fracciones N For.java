import jeliot.io.*;

import java.util.Scanner;

public class Suma{
 public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   int den = 0, den2, num;

   System.out.println("Valor Del Denominador:");
   den = in.nextInt();
   num = 1;
   den2 = 1;
   if(den>0){
   for(int x=2 ; x<=den; x++){
                num = ((den2*1)+(num*x));
                den2 = (den2*x);    
               
                         
           }
        System.out.println("Suma es: "+num+"/"+den2); 
   }else{
   System.out.println("�� Ingrese Un N�mero Mayor A Cero !!");
  }
  
  }
}
