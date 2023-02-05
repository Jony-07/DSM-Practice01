/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarepetitiva03;

/**
 *
 * @author J-morales
 */
public class EstructuraRepetitiva03 {

    public static void main(String[] args) {
        long factorial = 1;
        int n = 7;
        int i = 1;
        while(i<n+1){
            factorial = factorial * i;
            i++;
        }
        System.out.println("Factorial de  "  + n + " es " + factorial );
    }
    
}
