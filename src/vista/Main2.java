/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import modelo.Planeta;

/**
 *
 * @author Alejandro
 */
public class Main2 {
    public static void main(String[] args) {
        //Objeto 1
        Planeta tierra = new Planeta();
        //Objeto 2
        Planeta marte = new Planeta();
        //Objeto 3
        Planeta pluton = new Planeta();
        //Objeto 4
        Planeta urano = new Planeta();
        //Objeto 5
        Planeta jupiter = new Planeta();
        
        //Obj 1
            //Attr
            tierra.nombre = "Tierra";
            tierra.numSatelites = 1;
            tierra.masa = 600000000;
            tierra.volumen = 10800000;
            tierra.diametro = 12742;
            tierra.distSol = 150000000;
            tierra.tipoPlaneta = 2;
            tierra.observable = true;
            
            //Mtd
            tierra.imprimirAtrib();
            tierra.calcDensidad();
        
        //Obj 2
            //Attr
            marte.nombre = "Marte";
            marte.numSatelites = 2;
            marte.masa = 62300000;
            marte.volumen = 1630000;
            marte.diametro = 6794;
            marte.distSol = 228000000;
            marte.tipoPlaneta = 2;
            marte.observable = true;
            
            //Mtd
            marte.imprimirAtrib();
            marte.calcDensidad();
            
        //Obj 3
            //Attr
            pluton.nombre = "Plutón";
            pluton.numSatelites = 5;
            pluton.masa = 1300000;
            pluton.volumen = 706000;
            pluton.diametro = 2376;
            pluton.distSol = 591600000;
            pluton.tipoPlaneta = 3;
            pluton.observable = false;
            
            //Mtd
            pluton.imprimirAtrib();
            pluton.calcDensidad();
            
        //Obj 4
            //Attr
            urano.nombre = "Urano";
            urano.numSatelites = 14;
            urano.masa = 868100000;
            urano.volumen = 6834000;
            urano.diametro = 50724;
            urano.distSol = 300000000;
            urano.tipoPlaneta = 2;
            urano.observable = false;
            
            //Mtd
            urano.imprimirAtrib();
            urano.calcDensidad();
        
        //Obj 5
            //Attr
            jupiter.nombre = "Júpiter";
            jupiter.numSatelites = 95;
            jupiter.masa = 1898000000;
            jupiter.volumen = 14310000;
            jupiter.diametro = 139820;
            jupiter.distSol = 750000000;
            jupiter.tipoPlaneta = 1;
            jupiter.observable = true;
            
            //Mtd
            jupiter.imprimirAtrib();
            jupiter.calcDensidad();
    }
}
