/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial2;

import java.util.Scanner;

/**
 *
 * @author sgrue
 */
public class PARCIAL1 {

    public static void main(String[] args) {
        
        Libro libro = new Libro("VIDA", "SANTIAGO", 10, 0);
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Cuantos libros deseas: "); 
        int numberLibros = scanner.nextInt();
        
        for (int i = 0; i < numberLibros; i++) {
            libro.prestamo();    
        }
        
        libro.devolucion();
        
        libro.toString();
        
        
        
        
    }
}
