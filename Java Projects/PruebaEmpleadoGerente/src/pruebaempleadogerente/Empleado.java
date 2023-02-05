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
import java.util.*;
class Empleado 
{
   
    public Empleado(String n, double s, int anio, int mes, int dia)
    {
        nombre = n;
        salario = s;
        GregorianCalendar calendario = new GregorianCalendar(anio,mes-1,dia);
        fechaContratacion = calendario.getTime();
    }
    
    public String ObtenerNombre(){
        return nombre;
    }
    
    public double ObtenerSalario(){
        return salario;
    }
    
    public Date ObtenerFechaContratacion()
    {
        return fechaContratacion;
    }
    
    private String nombre;
    private double salario;
    private Date fechaContratacion;
}
