package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa un trapecio.
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Trapecio extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Base mayor del trapecio */
    private double baseMayor;
    
    /** Base menor del trapecio */
    private double baseMenor;
    
    /** Altura del trapecio */
    private double altura;
    
    /** Lado izquierdo del trapecio */
    private double ladoIzquierdo;
    
    /** Lado derecho del trapecio */
    private double ladoDerecho;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Trapecio.
     * 
     * @param nombre        Nombre del trapecio
     * @param color         Color del trapecio
     * @param posicionX     Posición X en el plano
     * @param posicionY     Posición Y en el plano
     * @param baseMayor     Base mayor del trapecio
     * @param baseMenor     Base menor del trapecio
     * @param altura        Altura del trapecio
     * @param ladoIzquierdo Lado izquierdo del trapecio
     * @param ladoDerecho   Lado derecho del trapecio
     */
    public Trapecio(String nombre, ColorFigura color, double posicionX, 
                    double posicionY, double baseMayor, double baseMenor, 
                    double altura, double ladoIzquierdo, double ladoDerecho) {
        super(nombre, color, posicionX, posicionY, TipoFigura.TRAPECIO);
        this.baseMayor = baseMayor;
        this.baseMenor = baseMenor;
        this.altura = altura;
        this.ladoIzquierdo = ladoIzquierdo;
        this.ladoDerecho = ladoDerecho;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área del trapecio.
     * Fórmula: ((baseMayor + baseMenor) * altura) / 2
     * 
     * @return Área del trapecio
     */
    @Override
    public double calcularArea() {
        return ((baseMayor + baseMenor) * altura) / 2;
    }
    
    /**
     * Calcula el perímetro del trapecio.
     * Fórmula: baseMayor + baseMenor + ladoIzquierdo + ladoDerecho
     * 
     * @return Perímetro del trapecio
     */
    @Override
    public double calcularPerimetro() {
        return baseMayor + baseMenor + ladoIzquierdo + ladoDerecho;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getBaseMayor() { return baseMayor; }
    public void setBaseMayor(double baseMayor) { this.baseMayor = baseMayor; }
    
    public double getBaseMenor() { return baseMenor; }
    public void setBaseMenor(double baseMenor) { this.baseMenor = baseMenor; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public double getLadoIzquierdo() { return ladoIzquierdo; }
    public void setLadoIzquierdo(double ladoIzquierdo) { this.ladoIzquierdo = ladoIzquierdo; }
    
    public double getLadoDerecho() { return ladoDerecho; }
    public void setLadoDerecho(double ladoDerecho) { this.ladoDerecho = ladoDerecho; }
}
// fin de la clase Trapecio