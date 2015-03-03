/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prgitejemplo;

/**
 *
 * @author bertoa
 * @author kheev
 */
public class GitAux {
    
    public void metodoAlumno1(){
        System.out.println("metodo 1");
	System.out.println("modificado por alumno 1"); // alumno 1
    }
    
    public void metodoAlumno2(){
        System.out.println("metodo 2");
    }
    
    public void metodoComunitario(){
    	// Comentario incluido para pruebas
	System.out.println("Aquí escribimos todos");
	// modificaciones alumno 1
	System.out.println("Alumno 1 inserta esta sentencia");
    }
    	//fin program
    public void testGitAux(){
    	// metodo rama testing
	System.out.println("Metodo de testing");
    }
}
