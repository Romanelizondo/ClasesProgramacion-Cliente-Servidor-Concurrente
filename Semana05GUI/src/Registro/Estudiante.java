/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Registro;

/**
 *
 * @author relznd
 */
public class Estudiante {
 
    private int cantH, cantM, cantCasado, cantViudo, cantDivorciado,
            cantSoltero, cantUnionLibre;
 
    public Estudiante() {
        this.cantH = 0;
        this.cantM = 0;
        this.cantCasado = 0;
        this.cantViudo = 0;
        this.cantDivorciado = 0;
        this.cantSoltero = 0;
        this.cantUnionLibre = 0;
    }
 
    public Estudiante(int cantH, int cantM, int cantCasado, int cantViudo,
            int cantDivorciado, int cantSoltero, int cantUnionLibre) {
        this.cantH = cantH;
        this.cantM = cantM;
        this.cantCasado = cantCasado;
        this.cantViudo = cantViudo;
        this.cantDivorciado = cantDivorciado;
        this.cantSoltero = cantSoltero;
        this.cantUnionLibre = cantUnionLibre;
    }
 
    public int getCantH() {
        return cantH;
    }
 
    public void setCantH() {
        this.cantH++;
    }
 
    public int getCantM() {
        return cantM;
    }
 
    public void setCantM() {
        this.cantM++;
    }
 
    public int getCantCasado() {
        return cantCasado;
    }
 
    public void setCantCasado() {
        this.cantCasado++;
    }
 
    public int getCantViudo() {
        return cantViudo;
    }
 
    public void setCantViudo() {
        this.cantViudo++;
    }
 
    public int getCantDivorciado() {
        return cantDivorciado;
    }
 
    public void setCantDivorciado() {
        this.cantDivorciado++;
    }
 
    public int getCantSoltero() {
        return cantSoltero;
    }
 
    public void setCantSoltero() {
        this.cantSoltero++;
    }
 
    public int getCantUnionLibre() {
        return cantUnionLibre;
    }
 
    public void setCantUnionLibre() {
        this.cantUnionLibre++;
    }
 
    public String verEstadistica() {
        return "Cantidad de mujeres: " + this.getCantM()
                + "\nCantidad de hombre: " + this.getCantH()
                + "\n\n      ***Estado Civil***      \n\n"
                + "\nSolteros: " + this.getCantSoltero()
                + "\nCasados: " + this.getCantCasado()
                + "\nViudos: " + this.getCantViudo()
                + "\nUnión Libre: " + this.getCantUnionLibre();
    }
 
    public void realizarConteo(String sexo, String estado) {
        if (sexo.contentEquals("H")) {
            this.setCantH();
        } else {
            this.setCantM();
        }
        //*****************************************************
        switch (estado) {
            case "Soltero":
                setCantSoltero();
                break;
            case "Divorciado":
                setCantDivorciado();
                break;
            case "Casado":
                setCantCasado();
                break;
            case "Viudo":
                setCantViudo();
                break;
            case "Union Libre":
                setCantUnionLibre();
                break;
 
        }
    }
}