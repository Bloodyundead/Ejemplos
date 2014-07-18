/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Ejemplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
       Date antes = new Date(100);
       Date ahora = new Date();
      
       
       
       System.out.print(ahora);
       System.out.print("mili de ahora: "+ ahora.getTime());

       if (ahora.getTime() > antes.getTime())
           System.out.println("ok ahora paso despues que antes");
       if(ahora.after(antes))
           System.out.println("ok ahora paso despues que antes");
       if(antes.before(ahora))
           System.out.println("ok ahora paso despues que antes");
           
       long diff = ahora.getTime() - antes.getTime();
       

    //Calendar
       
       Calendar c = Calendar.getInstance();
    //pasarlo a Date
       System.out.println(c.getTime());
       c.set(1982,Calendar.AUGUST,10);
       System.out.println(c.getTime());
       System.out.println(c.get(Calendar.YEAR));
       System.out.println(c.get(Calendar.DATE));
       System.out.println(c.get(Calendar.DAY_OF_YEAR));
       c.add(Calendar.YEAR,1);
       System.out.println(c.getTime());
       Date fecha = c.getTime();
       
    }
    
    }
    

