//Universidad del Valle de Guatemala
//Algoritmos y estructura de datos
//Catedrático Moises Alonso
//Segundo Semestre 2021
//Abner Ivan García Alegría
//Carné 21285
//Sección 20
//Actividad: hoja de trabajo 2

import java.util.Scanner;
import java.io.*;

public class Controlador {
//private static Stacks sta = new Stacks<Integer>();
   public static void main(String[] args){
   //Aqui se le pedira al usuario que ingrese la direccion del archivo txt 
   Scanner scan = new Scanner(System.in);
   System.out.println("");
   System.out.println("************Bienvenidos al programa Calculadora de expersiones postfish, que bueno tenerte de vuelta*************");
   System.out.println("");
   System.out.println("Ingrese el directorio donde se guardarán o se encuentran los datos");
   System.out.println("por Ejemplo: D:\\Programas\\"); 
   String Ubicacion = scan.nextLine();
   int resultado = 0;     
    //Aqui es donde leera el archivo que ingreos y lo imprimira
       try{
        BufferedReader br = new BufferedReader(new FileReader(Ubicacion));
        String cadena;
        while((cadena= br.readLine())!=null){
            System.out.println("Operacion a Realizar: "+cadena);
            
                }
            
        
}
catch (Exception e){

}
        
}
}


    

