/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen_practico_poo;

/**
 *
 * @author ihdzg
 */
public class EmpleadoTiempoCompleto extends Empleado {
    public EmpleadoTiempoCompleto(String nombre, double salarioBase) {
        super(nombre, salarioBase);
    }
    
    private double salarioAnual(){
        return getSalarioBase() * 12;
    }

    @Override
    public double calcularSalarioAnual() {
        return salarioAnual() + (salarioAnual() * 0.10);
    }
}
