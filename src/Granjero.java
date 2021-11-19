
/**
 * Write a description of class Granjero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Granjero
{
    // instance variables - replace the example below with your own
    private int edad;
    private String nombre;
    private String apellidos;
    private char sexo;
    private Mascota mascota;

    /**
     * Constructor for objects of class Granjero
     */
    public Granjero(String nombre, String apellidos, int edad, char sexo)
    {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad; 
        this.sexo = sexo;
        
    }

    public int getEdad() {
        return edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    
    public int getSexo() {
        return sexo;
    }
    //Si tienes una variable o parametro local que se llame igual, poner this. nombre a secas es el nombre parametro, this.nombre clase
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
   
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    
    public void setEdad(int Edad) {
        this.edad = Edad;
    }
    public void setMascota(Mascota mascota){
        this.mascota = mascota;
    }
    
    public String toString(){
        StringBuilder resultado = new StringBuilder();
        
        resultado.append("\nNombre: ");
        resultado.append(nombre);
        resultado.append("\nApellidos: ");
        resultado.append(apellidos);
        resultado.append("\nEdad: ");
        resultado.append(edad);
        resultado.append("\nSexo: ");
        resultado.append(sexo);
        resultado.append(mascota);
        return resultado.toString();
    }
    
}
