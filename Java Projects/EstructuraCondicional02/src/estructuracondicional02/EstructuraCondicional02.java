/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructuracondicional02;

/**
 *
 * @author usuario
 */
public class EstructuraCondicional02 {

    public static void main(String[] args) {
       int NotaEstudiante = 75;
       
       if(NotaEstudiante >= 90)
           System.out.println("A");
       else if (NotaEstudiante >= 80)
           System.out.println("B");
       else if (NotaEstudiante >= 70)
           System.out.println("C");
       else if (NotaEstudiante >= 60)
           System.out.println("D");
       else
           System.out.println("F");
    }
    
}
