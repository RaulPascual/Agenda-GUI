/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenda;

/**
 *
 * @author alumno
 */
public class Entrada implements Comparable<Entrada>{
    private String nombre;
    private String direccion;
    private int tfnoFijo;
    private int tfnoMovil;
    //Constructor

    public Entrada(String nombre, String direccion, int tfnoFijo, int tfnoMovil) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.tfnoFijo = tfnoFijo;
        this.tfnoMovil = tfnoMovil;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTfnoFijo() {
        return tfnoFijo;
    }

    public void setTfnoFijo(int tfnoFijo) {
        this.tfnoFijo = tfnoFijo;
    }

    public int getTfnoMovil() {
        return tfnoMovil;
    }

    public void setTfnoMovil(int tfnoMovil) {
        this.tfnoMovil = tfnoMovil;
    }

    @Override
    public String toString() {
        return "Entrada{" + "nombre=" + nombre + ", direccion=" + direccion + ", tfnoFijo=" + tfnoFijo + ", tfnoMovil=" + tfnoMovil + '}';
    }

    @Override
    public int compareTo(Entrada entrada) {
       return this.nombre.compareToIgnoreCase(entrada.nombre);
    }
     
   
    
    
    
}
