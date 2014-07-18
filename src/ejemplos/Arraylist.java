/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplos;
import java.util.ArrayList;
/**
 *
 * @author User
 */
public class Arraylist {
    public static void main(String[] args){
        //String arr[] = new String[long]
        ArrayList<String> cadenas = new ArrayList<>();
        //arr[pos] = valor
        cadenas.add("Carlos");
        cadenas.add("Edwin");
       for (int x = 0;x<cadenas.size();x++)
           System.out.println(cadenas.get(x));
        
        for (String cadena : cadenas) {
            System.out.println("" + cadena);
        }
        
        //cadenas.add(new Patito());
        //arr[pos]1111
        System.out.println(cadenas.get(0));
        //arr.length
        System.out.println("Size = "+cadenas.size());
        cadenas.remove(0);
        System.out.println(cadenas.get(0));
        //cadenas.clear();
        if (cadenas.contains("Edwin"))
            System.out.println("Esta");    
    }
}
