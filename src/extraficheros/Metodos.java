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
import java.util.Collections;
import java.util.Scanner;
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
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            p.close();
        }
    }
    
    public void leer(String notas){
        
        try {
            f = new File(notas);
            sc = new Scanner(f);
            while (sc.hasNextInt()) {
                if (sc.nextInt() >= 5)
                    escribir("aprobados.dat");
                else
                    escribir("suspensos.dat");
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }
    
    public void fichtoArray(String aprob){
        try {
            alum = new ArrayList<>();
            sc =  new Scanner(new File(aprob));
            while (sc.hasNextLine()) {
                String[] aux = sc.nextLine().split(",");
                Alumnos al = new Alumnos(aux[0], Integer.parseInt(aux[1]));
                alum.add(al);
            }
        } catch (FileNotFoundException ex) {
            ex.getMessage();
        } finally {
            sc.close();
        }
    }
    
    public void visualizar() {
        //for(int i=0;i<alum.size(); i++)
            Collections.sort(alum);
            System.out.println(alum.toString());
    }
    
    
}
