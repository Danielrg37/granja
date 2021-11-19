
/**
 * Write a description of class Mascota here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Mascota
{
    // instance variables - replace the example below with your own
    private String nombre;
    private int edad;
    private String tipo;
    /**
     * Constructor for objects of class Mascota
     */
    public Mascota(String nombre, int edad, String tipo)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.edad = edad;
        this.tipo = tipo;
    }
    
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nEdad: ");
        resultado.append(edad);
        resultado.append("\nTipo: ");
        resultado.append(tipo);
        
        return resultado.toString();
    }
}
