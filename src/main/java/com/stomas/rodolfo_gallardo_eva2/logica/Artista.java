/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.stomas.rodolfo_gallardo_eva2.logica;

import com.stomas.rodolfo_gallardo_eva2.gui.exceptions.ArtistaException;

/**
 *
 * @author Rodi
 */
public class Artista {
    private String nombre;
    private Integer cant_canciones_subidas;
    private Integer cant_reproducciones;
    private Genero enum_genero;

    public Artista() {
    }

    public Artista(String nombre, Integer cant_canciones_subidas, Integer cant_reproducciones, Genero enum_genero) {
        this.nombre = nombre;
        this.cant_canciones_subidas = cant_canciones_subidas;
        this.cant_reproducciones = cant_reproducciones;
        this.enum_genero = enum_genero;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCant_canciones_subidas() {
        return cant_canciones_subidas;
    }

    public void setCant_canciones_subidas(Integer cant_canciones_subidas) throws ArtistaException {
        if (cant_canciones_subidas < 0) {
            throw new ArtistaException("La cantidad de canciones subidas debe ser MAYOR A 0");
        } else {
            this.cant_canciones_subidas = cant_canciones_subidas;
        }
    }

    public Integer getCant_reproducciones() {
        return cant_reproducciones;
    }

    public void setCant_reproducciones(Integer cant_reproducciones) throws ArtistaException {
        
        if (cant_reproducciones < 0) {
            throw new ArtistaException("La cantidad de reproducciones debe ser MAYOR A 0");
        } else {
            this.cant_reproducciones = cant_reproducciones;
        }
    }

    public Genero getEnum_genero() {
        return enum_genero;
    }

    public void setEnum_genero(Genero enum_genero) {
        this.enum_genero = enum_genero;
    }

    @Override
    public String toString() {
        return "Nombre:" + nombre + " | Cantidad de canciones:" + cant_canciones_subidas + " | Cantidad de reproducciones:" + cant_reproducciones + " | Genero:" + enum_genero+ " | Pago:" +calcularPago();
    }
    
    
    public Double calcularPago() {
    double pago = cant_reproducciones / 1000.0; 
        if (cant_reproducciones > cant_canciones_subidas) {
            pago += pago * 0.1; //bono de 10%
        }
        return pago;
    } 
    
}
