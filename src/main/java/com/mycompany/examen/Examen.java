/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen;

import java.util.Scanner;

/**
 *
 * @author PUESTO 1
 */
public class Examen {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        int n;
        
        System.out.println("ingrese la dimension de la matriz");
        n = leer.nextInt();
        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        
        llenar_matriz(a,n);
        llenar_matriz(b,n);
        System.out.println("matriz a");
        mostrar_matriz(a,n);
        System.out.println("matriz b");
        mostrar_matriz(b,n);
        
        
        
        
        
        
        
    }//main
    
    public static void llenar_matriz(int[][] a, int n){
    
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                a[i][j] = (int) (Math.random() * 10) + 1;
            }
            
        }
    
    
    
    }
    
    
    public static void mostrar_matriz(int[][] a, int n){
    
        for (int i = 0; i < 3; i++) {
            
            for (int j = 0; j < 3; j++) {
                System.out.print(a[i][j]+ " ; ");
            }
            System.out.println("");
        }
    
    
    
    }
    
    
    public static void sumar_matriz(int[][] a, int[][] b, int n){
        int[][] respuesta= new int[n][n];

        for (int i = 0; i < 3; i++) {
            
            
            for (int j = 0; j < 3; j++) {
                
                respuesta[i][j]=a[i][j]+b[i][j];
                
            }
            
        }
         System.out.println("la suma entre matrices es");
         mostrar_matriz( respuesta, n);
}
    
    
      public static void restar_matriz(int[][] a, int[][] b, int n){
          int[][] respuesta= new int[n][n];

        for (int i = 0; i < 3; i++) {
            
            
            for (int j = 0; j < 3; j++) {
                
                respuesta[i][j]=a[i][j]-b[i][j];
                
            }
            
        }
         System.out.println("la resta entre matrices es");
         mostrar_matriz( respuesta, n);
         
         
         
         
         
         
         
         
      }
    
      
      public static void productoescalar_matriz(int[][] a, int n,int k){
          int[][] respuesta= new int[n][n];

        for (int i = 0; i < 3; i++) {
            
            
            for (int j = 0; j < 3; j++) {
                
                respuesta[i][j]=k*a[i][j];
                
            }
            
        }
         System.out.println("la multiplicacion entre matrices es");
         mostrar_matriz( respuesta, n);
         
         
         
         
         
         
         
         
      }
      
      
}//class
