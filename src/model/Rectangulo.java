package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa un rectángulo.
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Rectangulo extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Ancho del rectángulo */
    private double ancho;
    
    /** Alto del rectángulo */
    private double alto;
    
    /** Ángulo de rotación en grados */
    private double anguloRotacion;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Rectangulo.
     * 
     * @param nombre        Nombre del rectángulo
     * @param color         Color del rectángulo
     * @param posicionX     Posición X en el plano
     * @param posicionY     Posición Y en el plano
     * @param ancho         Ancho del rectángulo
     * @param alto          Alto del rectángulo
     * @param anguloRotacion Ángulo de rotación en grados
     */
    public Rectangulo(String nombre, ColorFigura color, double posicionX, 
                      double posicionY, double ancho, double alto, 
                      double anguloRotacion) {
        super(nombre, color, posicionX, posicionY, TipoFigura.RECTANGULO);
        this.ancho = ancho;
        this.alto = alto;
        this.anguloRotacion = anguloRotacion;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área del rectángulo.
     * Fórmula: ancho * alto
     * 
     * @return Área del rectángulo
     */
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
    
    /**
     * Calcula el perímetro del rectángulo.
     * Fórmula: 2 * (ancho + alto)
     * 
     * @return Perímetro del rectángulo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * (ancho + alto);
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getAncho() { return ancho; }
    public void setAncho(double ancho) { this.ancho = ancho; }
    
    public double getAlto() { return alto; }
    public void setAlto(double alto) { this.alto = alto; }
    
    public double getAnguloRotacion() { return anguloRotacion; }
    public void setAnguloRotacion(double anguloRotacion) { this.anguloRotacion = anguloRotacion; }
}
// fin de la clase Rectangulo