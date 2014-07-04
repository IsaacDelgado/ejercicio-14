/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejer14;
import javax.swing.*;

/**
 *
 * @author Isaac
 */
public class Ejer14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de x","Primer valor",JOptionPane.INFORMATION_MESSAGE));
        int y=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de y","Segundo valor",JOptionPane.INFORMATION_MESSAGE));
        int z=Integer.parseInt(JOptionPane.showInputDialog(null,"Ingrese el valor de z","Posición a buscar",JOptionPane.INFORMATION_MESSAGE));
        
        int[] array1=new int[z];
        int[] array2=new int[z];
        int salida1=0,salida2=0;
                
        
        for (int i = 0; i < z; i=i+2) {
            array1[i]=x;
            array2[i]=y;
            array1[i+1]=y;
            array2[i+1]=x;
            salida1=array1[i];
            salida2=array2[i];
            
           
            
        }
        System.out.println(salida1+""+salida2+" ");
    }
   


}
