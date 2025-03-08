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
        
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nombre del titulo del libro que deseas: "); 
        String nameLibro = scanner.nextLine();
        
        System.out.println("Nombre del autor del libro que deseas: "); 
        String nameAutor = scanner.nextLine();
        
        
        Libro libro = new Libro(nameLibro, nameAutor, 10, 0);
        
        
        System.out.println("Cuantos libros con el titulo "+libro.getTitulo()+" deseas pedir prestados: "); 
        int numberLibros = scanner.nextInt(); 
        
       
        for (int i = 0; i < numberLibros; i++) {
            libro.prestamo();    
        }


        
        System.out.println("Cuantos libros con el titulo "+libro.getTitulo()+" deseas devolver: "); 
        int numberLibrosDevueltos = scanner.nextInt(); 
        
       
        for (int i = 0; i < numberLibrosDevueltos; i++) {
            libro.devolucion();    
        }
            
        
        libro.toString();
        
    }
}
