
package senasalud;

import java.util.Scanner;


public class Senasalud {

   
    public static void main(String[] args) {
      String nom;   
      Scanner nombre =new Scanner (System.in);
      System.out.println("Hola bienvenido, ingrese su nombre");
      nom=nombre.next();
      System.out.println("su nombre es:" +nom);
      
      
      String ape;
      Scanner apellido =new Scanner  (System.in);
      System.out.println("Ingrese su apellido");
      ape=apellido.next();
        System.out.println("su apellido es:" +ape);
        
      int eda;
      Scanner edad =new Scanner  (System.in);
      System.out.println("Ingrese su edad");
      eda=edad.nextInt();
        System.out.println("su edad es:" +eda);
        
      String instru;
      Scanner instrumento =new Scanner (System.in);
      System.out.println("Ingrese su instrumento favorito");
      instru=instrumento.next();
        System.out.println("su instrumento favorito es:" +instru);
      
      
      
    }
    
}
