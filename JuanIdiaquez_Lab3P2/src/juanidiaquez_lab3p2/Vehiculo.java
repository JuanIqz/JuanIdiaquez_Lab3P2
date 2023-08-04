/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package juanidiaquez_lab3p2;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author User
 */
public class Vehiculo {
     String Placa;
     String Marca;
     String Modelo;
     String Tipo;
     Color Color;
     Date Año;

    public String getPlaca() {
        return Placa;
    }

    public String getMarca() {
        return Marca;
    }

    public String getModelo() {
        return Modelo;
    }

    public String getTipo() {
        return Tipo;
    }

    public Color getColor() {
        return Color;
    }

    public Date getAño() {
        return Año;
    }


    public void setPlaca(String Placa) {
        this.Placa = Placa;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public void setModelo(String Modelo) {
        this.Modelo = Modelo;
    }

    public void setTipo(String Tipo) {
        this.Tipo = Tipo;
    }

    public void setColor(Color Color) {
        this.Color = Color;
    }

    public void setAño(Date Año) {
        this.Año = Año;
    }

    public Vehiculo() {
    }

    public Vehiculo(String Placa, String Marca, String Modelo, String Tipo, Color Color, Date Año) {
        this.Placa = Placa;
        this.Marca = Marca;
        this.Modelo = Modelo;
        this.Tipo = Tipo;
        this.Color = Color;
        this.Año = Año;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "Placa=" + Placa + ", Marca=" + Marca + ", Modelo=" + Modelo + ", Tipo=" + Tipo + ", Color=" + Color + ", A\u00f1o=" + Año + "}\n";
    }

  
    
    
}
