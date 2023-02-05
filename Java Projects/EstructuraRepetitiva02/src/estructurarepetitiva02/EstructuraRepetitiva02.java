/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarepetitiva02;

/**
 *
 * @author usuario
 */
public class EstructuraRepetitiva02 {

    public static void main(String[] args) {
       long factorial =1;
       int n = 9;
       for(int i = 1;i < n+1;i++)
           factorial = factorial *i;
       
       System.out.println("Factorial de " + n + " es "+ factorial);
    }
    
}
