package model;

import enums.TipoFigura;
import enums.ColorFigura;

/**
 * Clase abstracta que representa una figura geométrica genérica.
 * Contiene los atributos y métodos comunes a todas las figuras.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public abstract class Figura {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre de la figura */
    private String nombre;
    
    /** Color de la figura */
    private ColorFigura color;
    
    /** Posición X en el plano cartesiano */
    private double posicionX;
    
    /** Posición Y en el plano cartesiano */
    private double posicionY;
    
    /** Tipo de figura geométrica */
    private TipoFigura tipo;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Figura.
     * 
     * @param nombre    Nombre de la figura
     * @param color     Color de la figura
     * @param posicionX Posición X en el plano
     * @param posicionY Posición Y en el plano
     * @param tipo      Tipo de figura geométrica
     */
    public Figura(String nombre, ColorFigura color, double posicionX, 
                  double posicionY, TipoFigura tipo) {
        this.nombre = nombre;
        this.color = color;
        this.posicionX = posicionX;
        this.posicionY = posicionY;
        this.tipo = tipo;
    }
    
    
    // ==================== MÉTODOS ABSTRACTOS ====================
    
    /**
     * Calcula el área de la figura.
     * Este método debe ser implementado por cada clase hija.
     * 
     * @return Área de la figura
     */
    public abstract double calcularArea();
    
    /**
     * Calcula el perímetro de la figura.
     * Este método debe ser implementado por cada clase hija.
     * 
     * @return Perímetro de la figura
     */
    public abstract double calcularPerimetro();
    
    
    // ==================== MÉTODOS CONCRETOS ====================
    
    /**
     * Mueve la figura a una nueva posición.
     * 
     * @param deltaX Desplazamiento en el eje X
     * @param deltaY Desplazamiento en el eje Y
     */
    public void mover(double deltaX, double deltaY) {
        this.posicionX += deltaX;
        this.posicionY += deltaY;
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public ColorFigura getColor() { return color; }
    public void setColor(ColorFigura color) { this.color = color; }
    
    public double getPosicionX() { return posicionX; }
    public void setPosicionX(double posicionX) { this.posicionX = posicionX; }
    
    public double getPosicionY() { return posicionY; }
    public void setPosicionY(double posicionY) { this.posicionY = posicionY; }
    
    public TipoFigura getTipo() { return tipo; }
    public void setTipo(TipoFigura tipo) { this.tipo = tipo; }
}
// fin de la clase Figura