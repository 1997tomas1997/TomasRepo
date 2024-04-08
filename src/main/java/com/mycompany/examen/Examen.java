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
        mostrar_matriz(a,n);
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
    
    
    
    
    
}//class
