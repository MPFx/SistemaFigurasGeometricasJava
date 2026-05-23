package util;

import model.Figura;
import java.util.List;

/**
 * Clase utilitaria para dibujar figuras en la consola.
 * Proporciona métodos para representar textualmente las figuras.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class DibujadorConsola {
    
    // ==================== MÉTODOS ====================
    
    /**
     * Dibuja una figura en la consola con su información.
     * 
     * @param f Figura a dibujar
     */
    public static void dibujarFigura(Figura f) {
        System.out.println("┌─────────────────────────────────────────┐");
        System.out.printf("│ Figura: %-33s │\n", f.getNombre());
        System.out.printf("│ Tipo: %-35s │\n", f.getTipo());
        System.out.printf("│ Color: %-34s │\n", f.getColor());
        System.out.printf("│ Posición: (%.1f, %.1f) %-19s │\n", 
            f.getPosicionX(), f.getPosicionY(), "");
        System.out.printf("│ Área: %-35.2f │\n", f.calcularArea());
        System.out.printf("│ Perímetro: %-31.2f │\n", f.calcularPerimetro());
        System.out.println("└─────────────────────────────────────────┘");
    }
    
    /**
     * Dibuja todas las figuras de una lista en la consola.
     * 
     * @param figuras Lista de figuras a dibujar
     */
    public static void dibujarTodas(List<Figura> figuras) {
        System.out.println("\n" + "=".repeat(50));
        System.out.println("         DIBUJANDO TODAS LAS FIGURAS");
        System.out.println("=".repeat(50));
        
        for (Figura f : figuras) {
            dibujarFigura(f);
            System.out.println();
        }
    }
    
    /**
     * Dibuja un resumen simple de la figura.
     * 
     * @param f Figura a resumir
     */
    public static void dibujarResumen(Figura f) {
        System.out.printf("[%s] %s: área=%.2f, perímetro=%.2f\n",
            f.getTipo(), f.getNombre(), f.calcularArea(), f.calcularPerimetro());
    }
}
// fin de la clase DibujadorConsola