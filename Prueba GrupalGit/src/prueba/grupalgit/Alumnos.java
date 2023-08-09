/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba.grupalgit;

/**
 * Clase que representa a un estudiante.
 * Esta clase almacena el nombre y el apellido de un estudiante.
 * 
 * @author LENOVO
 */
public class Alumnos {
    
    private String nombre;
    private String apellido;

    /**
     * Constructor de la clase Alumnos.
     * 
     * @param nombre El nombre del estudiante.
     * @param apellido El apellido del estudiante.
     */
    public Alumnos(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Obtiene el nombre del estudiante.
     * 
     * @return El nombre del estudiante.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del estudiante.
     * 
     * @param nombre El nuevo nombre del estudiante.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el apellido del estudiante.
     * 
     * @return El apellido del estudiante.
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Establece el apellido del estudiante.
     * 
     * @param apellido El nuevo apellido del estudiante.
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve una representación en cadena del objeto Alumnos.
     * 
     * @return Una cadena que muestra el nombre y el apellido del estudiante.
     */
    @Override
    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido;
    }
}
