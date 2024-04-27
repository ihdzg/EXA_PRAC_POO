/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practico_poo;

/**
 *
 * @author ihdzg
 */
public class EmpleadoPorHoras extends Empleado {
     private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, double salarioBase, int horasTrabajadas) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
    }
    
    private double horasTotales(){
        return horasTrabajadas * 4 * 12;
    
    }

    @Override
    public double calcularSalarioAnual() {
        return getSalarioBase() * horasTotales(); 
    }
}
