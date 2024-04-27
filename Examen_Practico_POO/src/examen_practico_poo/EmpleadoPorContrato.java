/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practico_poo;

/**
 *
 * @author ihdzg
 */
public class EmpleadoPorContrato extends Empleado{
     public EmpleadoPorContrato(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalarioBase() * 12;
    }
    
}
