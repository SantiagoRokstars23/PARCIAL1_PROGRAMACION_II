/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.parcial2;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author sgrue
 */
public class PARCIAL1 {

    public static void main(String[] args) {
        
        Libro libroRegalo = new Libro();
        
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Nombre del titulo del libro que deseas: "); 
        String nameLibro = scanner.nextLine();
        
        System.out.println("Nombre del autor del libro que deseas: "); 
        String nameAutor = scanner.nextLine();
        
        
        Libro libro = new Libro(nameLibro, nameAutor, 10, 0, LocalDate.now());
        
        
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
        
        System.out.println("Hola como vas"
                + " por el prestamo de uno de nuestros libros te regalamos "
                + "un libro titulado: "+libroRegalo.getTitulo()+ " del autor reconocido "+libro.getAutor()+" tiene un numero "
                        + "de "+libroRegalo.getNumeroEjemplares()+" ejemplares en el pais");
        
    }
}
