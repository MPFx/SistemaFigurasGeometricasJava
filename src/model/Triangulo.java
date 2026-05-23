package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase que representa un triángulo.
 * Hereda de Figura y sobrescribe los métodos calcularArea() y calcularPerimetro().
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Triangulo extends Figura {
    
    // ==================== ATRIBUTOS ESPECÍFICOS ====================
    
    /** Base del triángulo */
    private double base;
    
    /** Altura del triángulo */
    private double altura;
    
    /** Lado A del triángulo */
    private double ladoA;
    
    /** Lado B del triángulo */
    private double ladoB;
    
    /** Lado C del triángulo */
    private double ladoC;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Triangulo.
     * 
     * @param nombre    Nombre del triángulo
     * @param color     Color del triángulo
     * @param posicionX Posición X en el plano
     * @param posicionY Posición Y en el plano
     * @param base      Base del triángulo
     * @param altura    Altura del triángulo
     * @param ladoA     Lado A del triángulo
     * @param ladoB     Lado B del triángulo
     * @param ladoC     Lado C del triángulo
     */
    public Triangulo(String nombre, ColorFigura color, double posicionX, 
                     double posicionY, double base, double altura, 
                     double ladoA, double ladoB, double ladoC) {
        super(nombre, color, posicionX, posicionY, TipoFigura.TRIANGULO);
        this.base = base;
        this.altura = altura;
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }
    
    
    // ==================== MÉTODOS SOBRESCRITOS ====================
    
    /**
     * Calcula el área del triángulo.
     * Fórmula: (base * altura) / 2
     * 
     * @return Área del triángulo
     */
    @Override
    public double calcularArea() {
        return (base * altura) / 2;
    }
    
    /**
     * Calcula el perímetro del triángulo.
     * Fórmula: ladoA + ladoB + ladoC
     * 
     * @return Perímetro del triángulo
     */
    @Override
    public double calcularPerimetro() {
        return ladoA + ladoB + ladoC;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }
    
    public double getLadoA() { return ladoA; }
    public void setLadoA(double ladoA) { this.ladoA = ladoA; }
    
    public double getLadoB() { return ladoB; }
    public void setLadoB(double ladoB) { this.ladoB = ladoB; }
    
    public double getLadoC() { return ladoC; }
    public void setLadoC(double ladoC) { this.ladoC = ladoC; }
}
// fin de la clase Triangulo