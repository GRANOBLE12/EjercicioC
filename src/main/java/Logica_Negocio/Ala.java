/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;
/**
 *
 * @author 1059356842
 */
public class Ala {
    public String Posicion;
    public String Tamaño;

    public Ala(){
        
    }

    public Ala(String Posicion, String Tamaño) {
        this.Posicion = Posicion;
        this.Tamaño = Tamaño;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }
    
    
}
