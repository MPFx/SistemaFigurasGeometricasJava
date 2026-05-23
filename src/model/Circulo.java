package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa un círculo.
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Circulo extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Radio del círculo */
    private double radio;
    
    /** Diámetro del círculo (2 * radio) */
    private double diametro;
    
    /** Unidad de medida (cm, m, etc.) */
    private String unidad;
    
    /** Constante PI para cálculos */
    private static final double PI = 3.141592653589793;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Circulo.
     * 
     * @param nombre    Nombre del círculo
     * @param color     Color del círculo
     * @param posicionX Posición X en el plano
     * @param posicionY Posición Y en el plano
     * @param radio     Radio del círculo
     * @param unidad    Unidad de medida
     */
    public Circulo(String nombre, ColorFigura color, double posicionX, 
                   double posicionY, double radio, String unidad) {
        super(nombre, color, posicionX, posicionY, TipoFigura.CIRCULO);
        this.radio = radio;
        this.diametro = 2 * radio;
        this.unidad = unidad;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área del círculo.
     * Fórmula: π * r²
     * 
     * @return Área del círculo
     */
    @Override
    public double calcularArea() {
        return PI * radio * radio;
    }
    
    /**
     * Calcula el perímetro (circunferencia) del círculo.
     * Fórmula: 2 * π * r
     * 
     * @return Perímetro del círculo
     */
    @Override
    public double calcularPerimetro() {
        return 2 * PI * radio;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getRadio() { return radio; }
    public void setRadio(double radio) { 
        this.radio = radio; 
        this.diametro = 2 * radio;
    }
    
    public double getDiametro() { return diametro; }
    
    public String getUnidad() { return unidad; }
    public void setUnidad(String unidad) { this.unidad = unidad; }
}
// fin de la clase Circulo