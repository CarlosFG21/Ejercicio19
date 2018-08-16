
package ejercicio19video24;

import java.util.*;
import javax.swing.JOptionPane;

public class vector {
    
    public void vect(){
        
        String [] paises = new String[8];
        
        /*paises [0] = "ESPAÑA";
        paises [1] = "MEXICO";
        paises [2] = "COLOMBIA";
        paises [3] = "PERU";
        paises [4] = "CHILE";
        paises [5] = "ARGENTINA";
        paises [6] = "ECUADOR";
        paises [7] = "VENEZUELA";*/
        
       //String [] paises = {"ESPAÑA", "MEXICO","COLOMBIA","PERU","CHILE","ARGENTINA","ECUADOR","VENEZUELA"};
        
       /* for(int i=0; i <paises.length; i++){
         
            System.out.println("PAIS " + (i+1) + " " + paises[i]);
            
        }*/
       
       for(int i=0; i < 8; i++){
           
           paises[i]=JOptionPane.showInputDialog("INTRODUCE PAIS " + (i+1));
           
       }
       
       for(String elemento:paises){
           
           System.out.println("PAIS: " + elemento);
       }
    }
}
