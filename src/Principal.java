
/**
 * Write a description of class Principal here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Principal
{
     public static void main (){
         Granjero paco = new Granjero("Paco", "Jimenez", 58, 'H');
         Granja granjaDePaco = new Granja("Pacolandia", "Corea del Norte", paco);
         Mascota mascota = new Mascota("Rex", 13, "Perro");
         paco.setMascota(mascota);
         //busca el toString
         System.out.println(granjaDePaco);
     }
    }