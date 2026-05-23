package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa una elipse.
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Elipse extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Radio mayor de la elipse */
    private double radioMayor;
    
    /** Radio menor de la elipse */
    private double radioMenor;
    
    /** Constante PI para cálculos */
    private static final double PI = 3.141592653589793;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Elipse.
     * 
     * @param nombre      Nombre de la elipse
     * @param color       Color de la elipse
     * @param posicionX   Posición X en el plano
     * @param posicionY   Posición Y en el plano
     * @param radioMayor  Radio mayor de la elipse
     * @param radioMenor  Radio menor de la elipse
     */
    public Elipse(String nombre, ColorFigura color, double posicionX, 
                  double posicionY, double radioMayor, double radioMenor) {
        super(nombre, color, posicionX, posicionY, TipoFigura.ELIPSE);
        this.radioMayor = radioMayor;
        this.radioMenor = radioMenor;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área de la elipse.
     * Fórmula: π * radioMayor * radioMenor
     * 
     * @return Área de la elipse
     */
    @Override
    public double calcularArea() {
        return PI * radioMayor * radioMenor;
    }
    
    /**
     * Calcula el perímetro de la elipse (aproximación de Ramanujan).
     * Fórmula: π * [3(a+b) - √((3a+b)(a+3b))]
     * 
     * @return Perímetro aproximado de la elipse
     */
    @Override
    public double calcularPerimetro() {
        double a = radioMayor;
        double b = radioMenor;
        double h = Math.pow((a - b), 2) / Math.pow((a + b), 2);
        return PI * (a + b) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getRadioMayor() { return radioMayor; }
    public void setRadioMayor(double radioMayor) { this.radioMayor = radioMayor; }
    
    public double getRadioMenor() { return radioMenor; }
    public void setRadioMenor(double radioMenor) { this.radioMenor = radioMenor; }
}
// fin de la clase Elipse