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

   public static void main(String[] args){
   /* private Scanner scan = new Scanner(System.in);
    private Scanner stringscan = new Scanner(System.in);
        
    public String directorio(){
        System.out.println("Ingrese el directorio donde se guardarán o se encuentran los datos");
        System.out.println("por Ejemplo: D:\\Programas\\");
       */ //String direct = stringscan.nextLine(); 
       try{
        FileReader fr = new FileReader("C:\\Users\\Abner Garcia\\Documents\\UVG 3 SEMESTRE\\CURSOS\\ALGORITMOS DE DATOS\\Hoja2\\datos.txt");
        BufferedReader br = new BufferedReader(fr);
        String cadena;
        while((cadena= br.readLine())!=null){
            System.out.println(""+cadena);
        }
}
catch (Exception e){

}
        //return direct; 
}
}

    

