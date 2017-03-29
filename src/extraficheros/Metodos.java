/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraficheros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class Metodos {
    File f;
    PrintWriter p = null;
    Scanner sc;
    ArrayList<Alumnos> alum;
    
    public String pedirNombre(){
        return JOptionPane.showInputDialog("Introducir nombre: ");
    }
    
    public int pedirNota(){
        return Integer.parseInt(JOptionPane.showInputDialog("Introducir nota: "));
    }
    
    public void escribir(String notas){
        
        try {
            
            f =  new File(notas);
            p =  new PrintWriter(f);
            p.println(new Alumnos(pedirNombre(), pedirNota()));
//            p.println("Juan" + 5);
//            p.println("Pedro" + 7);
//            p.println("Marta" + 7);
//            p.println("Jorge" + 3);
//            p.println("Arturo" + 2);
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            p.close();
        }
    }
    
    
}
