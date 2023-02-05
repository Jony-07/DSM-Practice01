/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructurarepetitiva01;

/**
 *
 * @author usuario
 */
public class EstructuraRepetitiva01 {

    public static void main(String[] args) {
        long factorial = 1;
        int i = 1;
        int n = 5;
        do{
            factorial = factorial * i;
            i++;
        }while(i < n +1);
        
        System.out.println("Factorial de " + n + " es " + factorial);
    }
    
}
