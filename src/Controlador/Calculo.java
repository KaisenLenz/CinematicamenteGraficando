/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

/**
 *
 * @author Kaisen
 */
public class Calculo {
    //***********************************************MRU FORMULAS*************************************************************

    public double MRU_Distancia(double posicion, double velocidad, double tiempo) {
        double x;

        x = posicion + (velocidad * tiempo);

        return x;
    }

    public double MRU_Velocidad(double posicion_ini, double posicion_fin, double tiempo) {
        double x;

        x = (posicion_fin - posicion_ini) / (tiempo);

        return x;
    }

    public double MRU_Tiempo(double posicion_ini, double posicion_fin, double velocidad) {
        double x;

        x = (posicion_fin - posicion_ini) / (velocidad);

        return x;
    }

    //***********************************************MRUA FORMULAS*************************************************************
    public double MRUA_Distancia(double posicion, double velocidad, double tiempo, double aceleracion) {
        double x;

        x = posicion + (velocidad * tiempo) + (0.5 * aceleracion * Math.pow(tiempo, 2));
        return x;
    }

    public double MRUA_Velocidad(double velocidad, double aceleracion, double tiempo) {
        double x;

        x = velocidad + (aceleracion * tiempo);

        return x;
    }

    public double MRUA_Aceleracion(double velocidad_ini, double velocidad_fin, double tiempo) {
        double x;

        x = (velocidad_fin - velocidad_ini) / tiempo;

        return x;
    }

    public double MRUA_Tiempo(double velocidad_ini, double velocidad_fin, double aceleracion) {
        double x;

        x = (velocidad_fin - velocidad_ini) / aceleracion;

        return x;
    }

    //***********************************************CAIDA LIBRE FORMULAS*************************************************************
    public double CaidaLibre_Distancia(double tiempo) {
        double x;
        x = (0.5 * 9.8 * Math.pow(tiempo, 2));
        return x;
    }
    public double CaidaLibre_Distancia2(double velocidad) {
        double x;
        x =  (Math.pow(velocidad, 2))/(2*9.8);
        return x;
    }

    public double CaidaLibre_Velocidad(double tiempo) {
        double x;

        x = (9.8 * tiempo);

        return x;
    }

    public double CaidaLibre_Velocidad2(double distancia) {
        double x;
        x = (2 * 9.8 * distancia);
        x = Math.sqrt(x);
        return x;
    }
    public double CaidaLibre_Tiempo(double velocidad) {
        double x;
        x = 9.8 /velocidad;
        return x;
    }
    public double CaidaLibre_Tiempo2(double distancia) {
        double x;
        x = (2 * distancia)/9.8 ;
        x = Math.sqrt(x);
        return x;
    }
    

    //***********************************************VERTICAL ABAJO FORMULAS*************************************************************
    public double VerticalAbajo_Distancia(double posicion, double velocidad, double tiempo) {
        double x;

        x = posicion + (velocidad * tiempo) + (0.5 * 9.8 * Math.pow(tiempo, 2));
        return x;
    }

    public double VerticalAbajo_Velocidad(double velocidad, double tiempo) {
        double x;

        x = velocidad + (9.8 * tiempo);

        return x;
    }
    public double VerticalAbajo_Tiempo(double velocidad_ini, double velocidad_fin) {
        double x;

        x = (velocidad_fin - velocidad_ini) /(9.8);

        return x;
    }
    
    

    
    //***********************************************VERTICAL ARRIBA FORMULAS*************************************************************

    public double VerticalArriba_Distancia(double posicion, double velocidad, double tiempo) {
        double x;

        x = posicion + (velocidad * tiempo) - (0.5 * 9.8 * Math.pow(tiempo, 2));
        return x;
    }

    public double VerticalArriba_Velocidad(double velocidad, double tiempo) {
        double x;

        x = velocidad - (9.8 * tiempo);

        return x;
    }
    public double VerticalArriba_Tiempo(double velocidad_ini, double velocidad_fin) {
        double x;

        x = (velocidad_ini - velocidad_fin) /(-9.8);

        return x;
    }

    
}
