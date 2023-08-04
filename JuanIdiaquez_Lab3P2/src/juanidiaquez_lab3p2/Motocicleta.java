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
public class Motocicleta extends Vehiculo {
    private double Velocidad;
    private double Peso;
    private int CCombustible;

    public double getVelocidad() {
        return Velocidad;
    }

    public double getPeso() {
        return Peso;
    }

    public int getCCombustible() {
        return CCombustible;
    }

    public void setVelocidad(double Velocidad) {
        this.Velocidad = Velocidad;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    public void setCCombustible(int CCombustible) {
        this.CCombustible = CCombustible;
    }

    public Motocicleta(double Velocidad, double Peso, int CCombustible) {
        this.Velocidad = Velocidad;
        this.Peso = Peso;
        this.CCombustible = CCombustible;
    }

    public Motocicleta(double Velocidad, double Peso, int CCombustible, String Placa, String Marca, String Modelo, String Tipo, java.awt.Color Color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, Color, Año);
        this.Velocidad = Velocidad;
        this.Peso = Peso;
        this.CCombustible = CCombustible;
    }

    @Override
    public String toString() {
        return "Motocicleta{" + "Velocidad=" + Velocidad + ", Peso=" + Peso + ", CCombustible=" + CCombustible + "}\n";
    }
    
    
}
