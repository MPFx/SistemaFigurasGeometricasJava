package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa un cuadrado (caso especial de rectángulo).
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Cuadrado extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Lado del cuadrado */
    private double lado;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Cuadrado.
     * 
     * @param nombre    Nombre del cuadrado
     * @param color     Color del cuadrado
     * @param posicionX Posición X en el plano
     * @param posicionY Posición Y en el plano
     * @param lado      Longitud del lado
     */
    public Cuadrado(String nombre, ColorFigura color, double posicionX, 
                    double posicionY, double lado) {
        super(nombre, color, posicionX, posicionY, TipoFigura.CUADRADO);
        this.lado = lado;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área del cuadrado.
     * Fórmula: lado²
     * 
     * @return Área del cuadrado
     */
    @Override
    public double calcularArea() {
        return lado * lado;
    }
    
    /**
     * Calcula el perímetro del cuadrado.
     * Fórmula: 4 * lado
     * 
     * @return Perímetro del cuadrado
     */
    @Override
    public double calcularPerimetro() {
        return 4 * lado;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getLado() { return lado; }
    public void setLado(double lado) { this.lado = lado; }
}
// fin de la clase Cuadrado