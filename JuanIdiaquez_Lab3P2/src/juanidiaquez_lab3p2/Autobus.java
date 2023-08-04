/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab3p2;

import java.util.Date;

/**
 *
 * @author User
 */
public class Autobus extends Vehiculo{
    private int CPasajeros;
    private int NEjes;
    private int Longitud;

    public int getCPasajeros() {
        return CPasajeros;
    }

    public int getNEjes() {
        return NEjes;
    }

    public int getLongitud() {
        return Longitud;
    }

    public void setCPasajeros(int CPasajeros) {
        this.CPasajeros = CPasajeros;
    }

    public void setNEjes(int NEjes) {
        this.NEjes = NEjes;
    }

    public void setLongitud(int Longitud) {
        this.Longitud = Longitud;
    }

    public Autobus(int CPasajeros, int NEjes, int Longitud) {
        this.CPasajeros = CPasajeros;
        this.NEjes = NEjes;
        this.Longitud = Longitud;
    }

    public Autobus(int CPasajeros, int NEjes, int Longitud, String Placa, String Marca, String Modelo, String Tipo, java.awt.Color Color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, Color, Año);
        this.CPasajeros = CPasajeros;
        this.NEjes = NEjes;
        this.Longitud = Longitud;
    }

    @Override
    public String toString() {
        return "Autobus{" + "CPasajeros=" + CPasajeros + ", NEjes=" + NEjes + ", Longitud=" + Longitud + "Placa=" + Placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + ", Color=" + Color + ", A\u00f1o=" + Año+ "}\n";
    }
    
    
}
