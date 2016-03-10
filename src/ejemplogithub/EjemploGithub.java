/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplogithub;

/**
 *
 * @author saul
 */
public class EjemploGithub {

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Ejemplo de proyecto funcional con git ");
        Persona alumno;
        alumno = new Persona("Francisco", "gomez", 25);
        System.out.println("Mi nombre es" + alumno.getNombre());
        
    }
}
