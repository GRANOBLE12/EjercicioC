/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author 1059356842
 */
public class Motor {
    public String Tamaño;
    public String Id_motor;
    public String Posicion;

    public Motor(){
        
    }

    public Motor(String Tamaño, String Id_motor, String Posicion) {
        this.Tamaño = Tamaño;
        this.Id_motor = Id_motor;
        this.Posicion = Posicion;
    }

    public String getTamaño() {
        return Tamaño;
    }

    public void setTamaño(String Tamaño) {
        this.Tamaño = Tamaño;
    }

    public String getId_motor() {
        return Id_motor;
    }

    public void setId_motor(String Id_motor) {
        this.Id_motor = Id_motor;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }
    
    
}
