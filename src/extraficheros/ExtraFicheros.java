/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraficheros;

import javax.swing.JOptionPane;

/**
 *
 * @author jquesadaabeijon
 */
public class ExtraFicheros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos mt = new Metodos();
        int op = 0;
        
        do {
            try {
                op = Integer.parseInt(JOptionPane.showInputDialog(">>>MENU<<< \n1. Introducir datos \n2. Leer y separar por nota \n3. ArrayList de aprobados \n4. Visualizar \n5. Salir"));
                
            } catch (Exception e) {
                System.out.println(e.getMessage());
                
            }
            switch (op) {

                case 1:
                    mt.escribir("notas.dat");
                    break;
                case 2:
                    mt.leer("notas.dat");
                    break;
                case 3:
                    mt.fichtoArray("aprobados.dat");
                    break;
                case 4:
                    mt.visualizar();
                    break;
                case 5:
                    System.exit(0);
            }

        } while (op < 5);
    }
}
    

