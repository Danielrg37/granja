
/**
 * Write a description of class Granja here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granja
{
    // crear clase granjero y atrib granjero
    private Granjero granjero;
    private String nombre;
    private String ubicacion;
    /**
     * Constructor for objects of class Granja
     */
    public Granja(Granjero granjero)
    {
        // initialise instance variables
        this.granjero = granjero;
    }
    
     public Granja(String nombre, String ubicacion, Granjero granjero)
    {
        // initialise instance variables
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.granjero = granjero;
    }
     public String toString(){
        StringBuilder resultado = new StringBuilder();
        
        
        resultado.append("\nNombre: ");
         resultado.append(nombre);
        resultado.append("\nUbicacion: ");
         resultado.append(ubicacion);
        resultado.append("\nGranjero: ");
         resultado.append(granjero);
      
        return resultado.toString();
}
}
