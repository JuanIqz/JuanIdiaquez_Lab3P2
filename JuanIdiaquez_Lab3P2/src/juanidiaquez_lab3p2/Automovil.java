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
public class Automovil extends Vehiculo{
    private String Combustible;
    private int NPuertas;
    private String Transmision;
    private int NAsientos;

    public String getCombustible() {
        return Combustible;
    }

    public int getNPuertas() {
        return NPuertas;
    }

    public String getTransmision() {
        return Transmision;
    }

    public int getNAsientos() {
        return NAsientos;
    }

    public void setCombustible(String Combustible) {
        this.Combustible = Combustible;
    }

    public void setNPuertas(int NPuertas) {
        this.NPuertas = NPuertas;
    }

    public void setTransmision(String Transmision) {
        this.Transmision = Transmision;
    }

    public void setNAsientos(int NAsientos) {
        this.NAsientos = NAsientos;
    }

    public Automovil(String Combustible, int NPuertas, String Transmision, int NAsientos) {
        this.Combustible = Combustible;
        this.NPuertas = NPuertas;
        this.Transmision = Transmision;
        this.NAsientos = NAsientos;
    }

    public Automovil(String Combustible, int NPuertas, String Transmision, int NAsientos, String Placa, String Marca, String Modelo, String Tipo, java.awt.Color Color, Date Año) {
        super(Placa, Marca, Modelo, Tipo, Color, Año);
        this.Combustible = Combustible;
        this.NPuertas = NPuertas;
        this.Transmision = Transmision;
        this.NAsientos = NAsientos;
    }

    @Override
    public String toString() {
        return "Automovil{" + "Combustible=" + Combustible + ", NPuertas=" + NPuertas + ", Transmision=" + Transmision + ", NAsientos=" + NAsientos + "Placa=" + Placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + ", Color=" + Color + ", A\u00f1o=" + Año+"}\n";
    }
    
    
}
