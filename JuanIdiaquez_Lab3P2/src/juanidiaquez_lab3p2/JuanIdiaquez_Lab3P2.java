/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package juanidiaquez_lab3p2;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JColorChooser;

/**
 *
 * @author User
 */
public class JuanIdiaquez_Lab3P2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date fecha= new Date();
        int TotalB=0; 
        Scanner pd = new Scanner(System.in);
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
            int menu=pd.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese el Numero de placa");
                    String Placa= pd.next();
                    System.out.println("Ingrese la Marca");
                    String Marca= pd.next();
                    System.out.println("Ingrese el modelo");
                    String Modelo= pd.next();
                    System.out.println("Ingrese el tipo");
                    String Tipo= pd.next();
                    System.out.println("Seleccione un color");
                    Color color=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    int año=pd.nextInt();
                    fecha.setYear(año);
                    System.out.println("Marque el tipo de combustible");
                    String combustible=pd.next();
                    System.out.println("Marque el numero de puertas");
                    int Npuertas=pd.nextInt();
                    System.out.println("Marque la transmicion");
                    String Transimision=pd.next();
                    System.out.println("Marque el numero de asientos");
                    int Nasientos=pd.nextInt();
                    Vehiculos.add(new Automovil(combustible, Npuertas, Transimision, Nasientos, Placa, Marca, Modelo, Tipo, color, fecha));
                    break;
                case 2:
                    System.out.println("Ingrese el Numero de placa");
                    String PlacaM= pd.next();
                    System.out.println("Ingrese la Marca");
                    String MarcaM= pd.next();
                    System.out.println("Ingrese el modelo");
                    String ModeloM= pd.next();
                    System.out.println("Ingrese el tipo");
                    String TipoM= pd.next();
                    System.out.println("Seleccione un color");
                    Color colorM=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    int añoM=pd.nextInt();
                    fecha.setYear(añoM);
                    System.out.println("Ingrese la velocidad maxima");
                    double Velocidad=pd.nextDouble();
                    System.out.println("Ingrese el peso");
                    double Peso=pd.nextDouble();
                    System.out.println("Ingrese la cantidad maxima de combustible");
                    int CCombustible=pd.nextInt();
                    Vehiculos.add(new Motocicleta(Velocidad, Peso, CCombustible, PlacaM, MarcaM, ModeloM, TipoM, colorM,fecha ));
                    break;
                case 3:
                    System.out.println("Ingrese el Numero de placa");
                    String PlacaA= pd.next();
                    System.out.println("Ingrese la Marca");
                    String MarcaA= pd.next();
                    System.out.println("Ingrese el modelo");
                    String ModeloA= pd.next();
                    System.out.println("Ingrese el tipo");
                    String TipoA= pd.next();
                    System.out.println("Seleccione un color");
                    Color colorA=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    int añoA=pd.nextInt();
                    fecha.setYear(añoA);
                    System.out.println("Ingrese la cantidad de pasajeros");
                    int CPasajeros=pd.nextInt();
                    System.out.println("Ingrese el numero de ejes");
                    int NEjes=pd.nextInt();
                    System.out.println("Ingrese la longitud");
                    int Longitud=pd.nextInt();
                    Vehiculos.add(new Autobus(CPasajeros, NEjes, Longitud, PlacaA, MarcaA, ModeloA, TipoA, colorA, fecha));
                    break;
                case 4:
                    System.out.println("Los Vehiculos existentes son: ");
                    System.out.println();
                     System.out.println("Automoviles:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+""+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Automovil){
                            System.out.println((Vehiculo)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Motociclestas:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+""+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Motocicleta){
                            System.out.println((Motocicleta)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Autobuses:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+""+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Autobus){
                            System.out.println((Autobus)Vehiculos.get(i));
                        }
                    }
                    System.out.println("Marque la posicion del vehiculo a modificar");
                    int mod=pd.nextInt();
                    if (Vehiculos.get(mod) instanceof Automovil) {
                    System.out.println("Ingrese el Numero de placa");
                    Placa= pd.next();
                    System.out.println("Ingrese la Marca");
                    Marca= pd.next();
                    System.out.println("Ingrese el modelo");
                    Modelo= pd.next();
                    System.out.println("Ingrese el tipo");
                    Tipo= pd.next();
                    System.out.println("Seleccione un color");
                    color=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    año=pd.nextInt();
                    fecha.setYear(año);
                    System.out.println("Marque el tipo de combustible");
                    combustible=pd.next();
                    System.out.println("Marque el numero de puertas");
                    Npuertas=pd.nextInt();
                    System.out.println("Marque la transmicion");
                    Transimision=pd.next();
                    System.out.println("Marque el numero de asientos");
                    Nasientos=pd.nextInt();
                    Vehiculos.remove(mod);
                    Vehiculos.add(new Automovil(combustible, Npuertas, Transimision, Nasientos, Placa, Marca, Modelo, Tipo, color, fecha));
                    }
                    if (Vehiculos.get(mod) instanceof Motocicleta) {
                        System.out.println("Ingrese el Numero de placa");
                    PlacaM= pd.next();
                    System.out.println("Ingrese la Marca");
                    MarcaM= pd.next();
                    System.out.println("Ingrese el modelo");
                    ModeloM= pd.next();
                    System.out.println("Ingrese el tipo");
                    TipoM= pd.next();
                    System.out.println("Seleccione un color");
                    colorM=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    añoM=pd.nextInt();
                    fecha.setYear(añoM);
                    System.out.println("Ingrese la velocidad maxima");
                    Velocidad=pd.nextDouble();
                    System.out.println("Ingrese el peso");
                    Peso=pd.nextDouble();
                    System.out.println("Ingrese la cantidad maxima de combustible");
                    CCombustible=pd.nextInt();
                    Vehiculos.remove(mod);
                    Vehiculos.add(new Motocicleta(Velocidad, Peso, CCombustible, PlacaM, MarcaM, ModeloM, TipoM, colorM,fecha ));
                    }
                    if (Vehiculos.get(mod) instanceof Autobus) {
                    System.out.println("Ingrese el Numero de placa");
                    PlacaA= pd.next();
                    System.out.println("Ingrese la Marca");
                    MarcaA= pd.next();
                    System.out.println("Ingrese el modelo");
                    ModeloA= pd.next();
                    System.out.println("Ingrese el tipo");
                    TipoA= pd.next();
                    System.out.println("Seleccione un color");
                    colorA=JColorChooser.showDialog(null, "seleccione el color", Color.yellow);
                    System.out.println("Seleccione una fecha");
                    añoA=pd.nextInt();
                    fecha.setYear(añoA);
                    System.out.println("Ingrese la cantidad de pasajeros");
                    CPasajeros=pd.nextInt();
                    System.out.println("Ingrese el numero de ejes");
                    NEjes=pd.nextInt();
                    System.out.println("Ingrese la longitud");
                    Longitud=pd.nextInt();
                    Vehiculos.remove(mod);
                    Vehiculos.add(new Autobus(CPasajeros, NEjes, Longitud, PlacaA, MarcaA, ModeloA, TipoA, colorA, fecha));
                    }
                    break;
                case 5:
                    System.out.println("Los Vehiculos existentes son: ");
                    System.out.println();
                     System.out.println("Automoviles:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Automovil){
                            System.out.println((Vehiculo)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Motociclestas:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Motocicleta){
                            System.out.println((Motocicleta)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Autobuses:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Autobus){
                            System.out.println((Autobus)Vehiculos.get(i));
                        }
                    }
                    System.out.println("Marque la posicion del vehiculo a eliminar");
                    int remove=pd.nextInt();
                    Vehiculos.remove(remove);
                    break;
                case 6:
                    System.out.println("Automoviles:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        if (Vehiculos.get(i) instanceof Automovil){
                            System.out.println(i+"."+(Vehiculo)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Motociclestas:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        if (Vehiculos.get(i) instanceof Motocicleta motocicleta){
                            System.out.println(i+"."+motocicleta);
                        }
                    }
                    System.out.println();
                    System.out.println("Autobuses:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        if (Vehiculos.get(i) instanceof Autobus autobus){
                            System.out.println(i+"."+autobus);
                        }
                    }
                    break;
                case 7:
                     System.out.println("Los Vehiculos existentes son: ");
                    System.out.println();
                     System.out.println("Automoviles:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Automovil){
                            System.out.println((Vehiculo)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Motociclestas:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Motocicleta){
                            System.out.println((Motocicleta)Vehiculos.get(i));
                        }
                    }
                    System.out.println();
                    System.out.println("Autobuses:");
                    for (int i = 0; i < Vehiculos.size(); i++) {
                        System.out.println(i+"."+Vehiculos.get(i));
                        if (Vehiculos.get(i) instanceof Autobus){
                            System.out.println((Autobus)Vehiculos.get(i));
                        }
                    }
                    System.out.println("Marque la posicion del vehiculo a voletar");
                    int pos=pd.nextInt();
                    if (Vehiculos.get(pos) instanceof Automovil) {
                        TotalB=525+1200;
                        System.out.println("Boleta de revision vehicular");
                        System.out.println(Vehiculos.get(pos));
                        System.out.println("Total a pagar: "+TotalB);
                    }
                    if (Vehiculos.get(pos) instanceof Motocicleta) {
                        TotalB=525+200;
                        System.out.println("Boleta de revision vehicular");
                        System.out.println(Vehiculos.get(pos));
                        System.out.println("Total a pagar: "+TotalB);
                    }
                    if (Vehiculos.get(pos) instanceof Autobus) {
                        TotalB=525+1000;
                        System.out.println("Boleta de revision vehicular");
                        System.out.println(Vehiculos.get(pos));
                        System.out.println("Total a pagar: "+TotalB);
                    }
                    break;
                case 8:
                    System.out.println("Saliendo...");
                    banderaI=1;
                    break;
                default:
                    System.out.println("opcion invalida, ingrese otra");
                   break;
            }
        }
    }
    
}
