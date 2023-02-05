package pruebaempleadogerente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author J-morales
 */
class Gerente extends Empleado{
    
    public Gerente(String n, double s, int anio, int mes, int dia)
    {
        super(n,s,anio,mes,dia);
        bono = 0 ;
    }
    
    public double ObtenerSalario()
    {
        double salarioBase = super.ObtenerSalario();
        return salarioBase + bono;
    }
    
    public void obtenerBono(double b)
    {
        bono = b;
    }
    
    private double bono;
}
