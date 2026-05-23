package service;

import model.Figura;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que representa un lienzo donde se dibujan figuras geométricas.
 * Gestiona una colección de figuras y calcula áreas totales.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Lienzo {
    
    // ==================== ATRIBUTOS ====================
    
    /** Nombre del lienzo */
    private String nombre;
    
    /** Ancho del lienzo en píxeles */
    private int ancho;
    
    /** Alto del lienzo en píxeles */
    private int alto;
    
    /** Color de fondo del lienzo */
    private String fondo;
    
    /** Nivel de zoom del lienzo */
    private int zoom;
    
    /** Lista de figuras dibujadas en el lienzo */
    private List<Figura> figuras;
    
    
    // ==================== CONSTRUCTOR ====================
    
    /**
     * Constructor de la clase Lienzo.
     * 
     * @param nombre Nombre del lienzo
     * @param ancho  Ancho en píxeles
     * @param alto   Alto en píxeles
     * @param fondo  Color de fondo
     * @param zoom   Nivel de zoom
     */
    public Lienzo(String nombre, int ancho, int alto, String fondo, int zoom) {
        this.nombre = nombre;
        this.ancho = ancho;
        this.alto = alto;
        this.fondo = fondo;
        this.zoom = zoom;
        this.figuras = new ArrayList<>();
    }
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Agrega una figura al lienzo.
     * 
     * @param f Figura a agregar
     */
    public void agregarFigura(Figura f) {
        figuras.add(f);
        System.out.println("Figura " + f.getNombre() + " agregada al lienzo " + nombre);
    }
    
    /**
     * Remueve una figura del lienzo por su índice.
     * 
     * @param index Índice de la figura a remover
     */
    public void removerFigura(int index) {
        if (index >= 0 && index < figuras.size()) {
            Figura removida = figuras.remove(index);
            System.out.println("Figura " + removida.getNombre() + " removida del lienzo");
        }
    }
    
    /**
     * Calcula el área total de todas las figuras en el lienzo.
     * Este método demuestra polimorfismo (llama a calcularArea() de cada figura).
     * 
     * @return Suma de todas las áreas
     */
    public double calcularAreaTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }
    
    /**
     * Calcula el perímetro total de todas las figuras en el lienzo.
     * 
     * @return Suma de todos los perímetros
     */
    public double calcularPerimetroTotal() {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        return total;
    }
    
    /**
     * Lista todas las figuras con sus áreas calculadas.
     * Demostración de polimorfismo.
     */
    public void listarAreas() {
        System.out.println("\n--- FIGURAS EN EL LIENZO '" + nombre + "' ---");
        for (Figura f : figuras) {
            System.out.printf("Figura: %-10s | Tipo: %-10s | Área: %.2f\n",
                f.getNombre(), f.getTipo(), f.calcularArea());
        }
        System.out.printf("ÁREA TOTAL: %.2f\n", calcularAreaTotal());
    }
    
    
    // ==================== GETTERS Y SETTERS ====================
    
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public int getAncho() { return ancho; }
    public void setAncho(int ancho) { this.ancho = ancho; }
    
    public int getAlto() { return alto; }
    public void setAlto(int alto) { this.alto = alto; }
    
    public String getFondo() { return fondo; }
    public void setFondo(String fondo) { this.fondo = fondo; }
    
    public int getZoom() { return zoom; }
    public void setZoom(int zoom) { this.zoom = zoom; }
    
    public List<Figura> getFiguras() { return figuras; }
}
// fin de la clase Lienzo