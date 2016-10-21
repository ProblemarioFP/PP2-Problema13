/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.problema13;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class PP2Problema13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

 
        int [] arr = new int [30];  // Declracion de variables y creación de arreglo
        int mayor,menor;
        double prom;
        
        System.out.println(arr.length);     //Declaracion de metodos
        arr=llenarArreglo(arr);
        prom= promedio(arr);
        mayor=mayorProm(arr,prom);
        menor=menorProm(arr,prom);
        mostrarArreglo(prom,mayor,menor);
    }
    public static int[]  llenarArreglo(int [] a){       //Metodo para llenar el arreglo (Manualmente)
        Scanner entrada = new Scanner(System.in);
        for(int i=0; i<30;++i){
            
                System.out.println("Introduce la posicion ["+i+"]");
                a[i]= entrada.nextInt();
        }
    return a;
    }
    public static double promedio(int []a) {        //Metodo que calcula el promedio de los valores introducidos en el arreglo
        double suma=0;
        double promedio=0;
        for(int i=0; i<30;++i){
             suma= suma+a[i];
             promedio= suma/30;  
    }
        return promedio;
    }
    
    public static int mayorProm(int a[],double b) {     //Metodo que calcula la cantidad de datos en el arreglo 
       int contarMayorQ=0;                              //Que estan por encima de la media
        for(int i=0; i<30;++i){
             if (a[i]>b) {
                 contarMayorQ=contarMayorQ+1;                 
             }}
        return contarMayorQ;
    }
    public static int menorProm(int a[],double b) {     //Metodo que calcula la cantidad de datos en el arreglo
       int contarMenorQ=0;                              //Que estan por debajo de la media
        for(int i=0; i<30;++i){
             if (a[i]<b) {
                 contarMenorQ=contarMenorQ+1;                 
             }}
        return contarMenorQ;
    }
    
    
    public static void mostrarArreglo(double a,int b, int c){   //Metodo que muestra el promedio del arreglo, los datos por encima del promedio
                                                                //y los datos por debajo del promedio
        System.out.println("Promedio de los datos introducidos: " +a);
        System.out.println("Número de datos por encima del promedio: "+b);
        System.out.println("Número de datos por debajo del promedio: "+c);
        }
    }
