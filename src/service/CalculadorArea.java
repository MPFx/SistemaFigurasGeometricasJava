package service;

import model.Figura;
import java.util.List;

/**
 * Clase utilitaria para realizar cálculos geométricos sobre colecciones de figuras.
 * Contiene métodos estáticos que demuestran polimorfismo.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class CalculadorArea {
    
    // ==================== CONSTANTES ====================
    
    /** Constante PI para cálculos */
    public static final double PI = 3.141592653589793;
    
    /** Versión del calculador */
    public static final String VERSION = "1.0";
    
    
    // ==================== MÉTODOS ====================
    
    /**
     * Suma las áreas de todas las figuras en la lista.
     * 
     * @param figuras Lista de figuras
     * @return Suma total de áreas
     */
    public static double sumarAreas(List<Figura> figuras) {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularArea();
        }
        return total;
    }
    
    /**
     * Suma los perímetros de todas las figuras en la lista.
     * 
     * @param figuras Lista de figuras
     * @return Suma total de perímetros
     */
    public static double sumarPerimetros(List<Figura> figuras) {
        double total = 0;
        for (Figura f : figuras) {
            total += f.calcularPerimetro();
        }
        return total;
    }
    
    /**
     * Encuentra la figura con mayor área en la lista.
     * 
     * @param figuras Lista de figuras
     * @return Figura con mayor área (null si la lista está vacía)
     */
    public static Figura getFiguraMayorArea(List<Figura> figuras) {
        if (figuras == null || figuras.isEmpty()) {
            return null;
        }
        
        Figura mayor = figuras.get(0);
        for (Figura f : figuras) {
            if (f.calcularArea() > mayor.calcularArea()) {
                mayor = f;
            }
        }
        return mayor;
    }
    
    /**
     * Imprime una comparativa entre dos figuras.
     * 
     * @param f1 Primera figura
     * @param f2 Segunda figura
     */
    public static void imprimirComparativa(Figura f1, Figura f2) {
        System.out.println("\n--- COMPARATIVA DE FIGURAS ---");
        System.out.printf("%-15s | Área: %.2f | Perímetro: %.2f\n", 
            f1.getNombre(), f1.calcularArea(), f1.calcularPerimetro());
        System.out.printf("%-15s | Área: %.2f | Perímetro: %.2f\n", 
            f2.getNombre(), f2.calcularArea(), f2.calcularPerimetro());
        
        double diferencia = f1.calcularArea() - f2.calcularArea();
        if (diferencia > 0) {
            System.out.println(f1.getNombre() + " tiene mayor área por " + diferencia);
        } else if (diferencia < 0) {
            System.out.println(f2.getNombre() + " tiene mayor área por " + (-diferencia));
        } else {
            System.out.println("Ambas figuras tienen la misma área");
        }
    }
}
// fin de la clase CalculadorArea