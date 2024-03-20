/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import Logica_Negocio.Avion;

/**
 *
 * @author 1059356842
 */
public class HelperImpresion {
    public static void ImprimirInfoLocal(Avion avion) {

        System.out.println("Marca del avion" + "\t" + avion.getMarca());
        System.out.println("Fuselaje del avion" + "\t" + avion.getObjFuselaje().getNombre());

        for (int i = 0; i < avion.getListaalas().size(); i++) {

            System.out.println("Ala del avion" + "\t" + avion.getListaalas().get(i).getPosicion());
            System.out.println("Ala del avion" + "\t" + avion.getListaalas().get(i).getTamaño());
        }

        for (int i = 0; i < avion.getListallantas().size(); i++) {

            System.out.println("Llanta del avion" + "\t" + avion.getListallantas().get(i).getMarca());
            System.out.println("Llanta del avion" + "\t" + avion.getListallantas().get(i).getTamaño());
        }

        for (int i = 0; i < avion.getListamotor().size(); i++) {

            System.out.println("Motor del avion" + "\t" + avion.getListamotor().get(i).getId_motor());
            System.out.println("Tamaño del avion" + "\t" + avion.getListamotor().get(i).getTamaño());
            System.out.println("Motor del avion" + "\t" + avion.getListamotor().get(i).getPosicion());
        }

    }
    
}
