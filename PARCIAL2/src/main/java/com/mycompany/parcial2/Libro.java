
package com.mycompany.parcial2;

import java.time.LocalDate;



public class Libro {
    
    private String titulo;
    private String autor;
    private int numeroEjemplares;
    private int numeroEjemplaresP;
    private LocalDate fechaImpresion;

    public Libro() {
        this.titulo = "LIBRO POR DEFECTO";
        this.autor = "SANTIAGO GRUESO";
        this.numeroEjemplares = 100;
        this.numeroEjemplaresP = 0;
        this.fechaImpresion = LocalDate.now();
    }

    public Libro(String titulo, String autor, int numeroEjemplares, int numeroEjemplaresP, LocalDate local) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroEjemplares = numeroEjemplares;
        this.numeroEjemplaresP = numeroEjemplaresP;
        this.fechaImpresion = local;
    
    }
   
   
    
   
    //SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public void setNumeroEjemplaresP(int numeroEjemplaresP) {
        this.numeroEjemplaresP = numeroEjemplaresP;
    }

    public void setFechaImpresion(LocalDate fechaImpresion) {
        this.fechaImpresion = fechaImpresion;
    }

    
    

    
    //GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public int getNumeroEjemplaresP() {
        return numeroEjemplaresP;
    }

    public LocalDate getFechaImpresion() {
        return fechaImpresion;
    }
    
        
    
    
    public boolean prestamo(){
    
        if(this.numeroEjemplaresP <= this.numeroEjemplares){
            this.numeroEjemplaresP++;
            //this.numeroEjemplares--;
            System.out.println("se presto un libro");
            return true;
        }else if(this.numeroEjemplares==0){
            System.err.println("No hay ejemplares disponibles");
        }
        
        return false;
    
    }
    
    
    public boolean devolucion(){
         
        if(this.numeroEjemplaresP!=0){
            
            this.numeroEjemplaresP--;
            //this.numeroEjemplares++;
            
            System.out.println("libro devuelto con exito");
            return true;
        }else if(this.numeroEjemplaresP==0){
            System.err.println("Ese libro no se ha prestado");
        }

        
        return false;
    
    }

    @Override
    public String toString() {
        
        System.out.println("Numero de ejemplares disponibles: "+this.numeroEjemplares);
        System.out.println("Numero de ejemplares prestados: "+this.numeroEjemplaresP);
        
        System.out.println("Nombre del libro: "+this.titulo);
        System.out.println("Nombre del autor: "+this.autor);
        System.out.println("Fecha de impresion: "+this.fechaImpresion);
        
        return super.toString();
    
    }
    
    
    
    
    
}
