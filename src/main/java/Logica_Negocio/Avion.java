/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;

/**
 *
 * @author 1059356842
 */
public class Avion {

    public String Marca;
    public ArrayList<Motor> Listamotor;
    public ArrayList<Llanta> Listallantas;
    public ArrayList<Ala> Listaalas;
    public Fuselaje objFuselaje;

    public Avion() {

    }

    public Avion(String Marca, ArrayList<Motor> Listamotor, ArrayList<Llanta> Listallantas, ArrayList<Ala> Listaalas, Fuselaje objFuselaje) {
        this.Marca = Marca;
        this.Listamotor = Listamotor;
        this.Listallantas = Listallantas;
        this.Listaalas = Listaalas;
        this.objFuselaje = objFuselaje;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public ArrayList<Motor> getListamotor() {
        return Listamotor;
    }

    public void setListamotor(ArrayList<Motor> Listamotor) {
        this.Listamotor = Listamotor;
    }

    public ArrayList<Llanta> getListallantas() {
        return Listallantas;
    }

    public void setListallantas(ArrayList<Llanta> Listallantas) {
        this.Listallantas = Listallantas;
    }

    public ArrayList<Ala> getListaalas() {
        return Listaalas;
    }

    public void setListaalas(ArrayList<Ala> Listaalas) {
        this.Listaalas = Listaalas;
    }

    public Fuselaje getObjFuselaje() {
        return objFuselaje;
    }

    public void setObjFuselaje(Fuselaje objFuselaje) {
        this.objFuselaje = objFuselaje;
    }

   
}
