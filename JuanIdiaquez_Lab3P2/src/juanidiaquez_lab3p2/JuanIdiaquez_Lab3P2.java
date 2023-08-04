/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juanidiaquez_lab3p2;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class JuanIdiaquez_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Bienvenido al sistema de registro vehicular");
         ArrayList<Vehiculo> Vehiculos = new ArrayList();
        int banderaI = 0;
        while (banderaI != 1) {
            System.out.println("Sus opciones son las siguientes:");
            System.out.println();
            System.out.println("1.Agregar automovil");
            System.out.println("2.Agregar motocicleta ");
            System.out.println("3.Agregar autobus");
            System.out.println("4.modificar vehiculo ");
            System.out.println("5.eliminar vehiculo");
            System.out.println("6.listar vehiculos ");
            System.out.println("7.generar boleta");
            System.out.println("8.Salir ");
            System.out.println();
            System.out.println("Ingrese el numero de enfrente de la opcion para selecionarla");
            int menu=0;
            switch (menu) {
                case 1:
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                case 4:
                    
                    break;
                case 5:
                    
                    break;
                case 6:
                    
                    break;
                case 7:
                    
                    break;
                case 8:
                    
                    break;
                default:
                    System.out.println("opcion invalida, ingrese otra");
                   break;
            }
        }
    }
    
}
