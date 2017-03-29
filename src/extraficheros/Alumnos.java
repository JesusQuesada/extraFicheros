/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraficheros;

/**
 *
 * @author jquesadaabeijon
 */
public class Alumnos {
    String nombre;
    int notas;

    public Alumnos() {
    }

    public Alumnos(String nombre, int notas) {
        this.nombre = nombre;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Alumnos{" + "nombre=" + nombre + ", notas=" + notas + '}';
    }
    
    
}
