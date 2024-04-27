/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_practico_poo;

/**
 *
 * @author ihdzg
 */
public class Examen_Practico_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Empleado empleadoTC = new EmpleadoTiempoCompleto("Juancho Hernangomez", 4500);
        Empleado empleadoPH = new EmpleadoPorHoras("Pedro Rodriguez Fernandez", 10, 160);
        Empleado empleadoPC = new EmpleadoPorContrato("Maria Morales Cano", 6000);

        imprimirDatos(empleadoTC);
        imprimirDatos(empleadoPH);
        imprimirDatos(empleadoPC);
    }

    public static void imprimirDatos(Empleado empleado) {
        System.out.println("Nombre: " + empleado.getNombre());
        System.out.println("Salario anual: " + empleado.calcularSalarioAnual());
    
    }
    
}
