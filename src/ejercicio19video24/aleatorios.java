
package ejercicio19video24;

import java.util.*;

public class aleatorios {
 
    public void hacer(){
        
        int [] matrizale = new int[15];
        
        for(int i=0; i<matrizale.length; i++){
            
            matrizale[i]=(int)Math.round(Math.random()*100);
              
        }
        
     for(int numeros:matrizale){
         
         System.out.println(numeros + "");
     }
    }
    
}
