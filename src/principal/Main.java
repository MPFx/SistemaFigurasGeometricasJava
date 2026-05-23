package principal;

import model.*;
import service.*;
import util.*;
import enums.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase principal del Sistema de Figuras Geométricas.
 * Demuestra el uso de herencia y polimorfismo con diferentes tipos de figuras.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public class Main {
    
    /**
     * Método principal que ejecuta la demostración del sistema.
     * 
     * @param args Argumentos de línea de comandos (no utilizados)
     */
    public static void main(String[] args) {
        System.out.println("=".repeat(60));
        System.out.println("SISTEMA DE FIGURAS GEOMÉTRICAS - DEMOSTRACIÓN");
        System.out.println("=".repeat(60));
        
        // ========== POLIMORFISMO EN ACCIÓN ==========
        // Crear una lista de tipo Figura (clase base)
        List<Figura> figuras = new ArrayList<>();
        
        System.out.println("\n1. CREANDO FIGURAS DE DIFERENTES TIPOS...");
        
        // Crear figuras usando polimorfismo (la variable es de tipo Figura,
        // pero el objeto es de una clase hija específica)
        Figura fig1 = new Circulo("Círculo Rojo", ColorFigura.ROJO, 0, 0, 5.0, "cm");
        Figura fig2 = new Rectangulo("Rectángulo Azul", ColorFigura.AZUL, 10, 10, 4.0, 6.0, 0);
        Figura fig3 = new Triangulo("Triángulo Verde", ColorFigura.VERDE, 20, 20, 3.0, 4.0, 3.0, 4.0, 5.0);
        Figura fig4 = new Cuadrado("Cuadrado Amarillo", ColorFigura.AMARILLO, 30, 30, 5.0);
        Figura fig5 = new Elipse("Elipse Naranja", ColorFigura.AMARILLO, 40, 40, 8.0, 5.0);
        Figura fig6 = new Trapecio("Trapecio Gris", ColorFigura.NINGUNO, 50, 50, 10.0, 6.0, 4.0, 5.0, 5.0);
        
        figuras.add(fig1);
        figuras.add(fig2);
        figuras.add(fig3);
        figuras.add(fig4);
        figuras.add(fig5);
        figuras.add(fig6);
        
        // ========== DEMOSTRACIÓN DE POLIMORFISMO ==========
        System.out.println("\n2. DEMOSTRACIÓN DE POLIMORFISMO:");
        System.out.println("   (Recorriendo lista de Figuras y llamando a calcularArea())");
        System.out.println("-".repeat(60));
        
        // POLIMORFISMO: aunque la lista es de tipo Figura,
        // al llamar a calcularArea() se ejecuta la versión específica de cada clase hija
        for (Figura f : figuras) {
            System.out.printf("Figura: %-20s | Tipo: %-10s | Área: %10.2f | Perímetro: %10.2f\n",
                f.getNombre(), f.getTipo(), f.calcularArea(), f.calcularPerimetro());
        }
        
        // ========== LIENZO ==========
        System.out.println("\n3. CREANDO LIENZO Y AGREGANDO FIGURAS...");
        Lienzo lienzo = new Lienzo("Lienzo Principal", 800, 600, "Blanco", 100);
        
        for (Figura f : figuras) {
            lienzo.agregarFigura(f);
        }
        
        lienzo.listarAreas();
        
        // ========== CALCULADOR ==========
        System.out.println("\n4. CÁLCULOS CON CALCULADOR GEOMÉTRICO:");
        System.out.printf("Suma de todas las áreas: %.2f\n", CalculadorArea.sumarAreas(figuras));
        System.out.printf("Suma de todos los perímetros: %.2f\n", CalculadorArea.sumarPerimetros(figuras));
        
        Figura mayor = CalculadorArea.getFiguraMayorArea(figuras);
        System.out.println("Figura con mayor área: " + (mayor != null ? mayor.getNombre() : "Ninguna"));
        
        // ========== COMPARATIVA ==========
        System.out.println("\n5. COMPARATIVA ENTRE FIGURAS:");
        CalculadorArea.imprimirComparativa(fig1, fig2);
        
        // ========== DIBUJADOR ==========
        System.out.println("\n6. DIBUJANDO FIGURAS EN CONSOLA:");
        DibujadorConsola.dibujarFigura(fig1);
        
        System.out.println("\n7. RESUMEN DE FIGURAS:");
        for (Figura f : figuras) {
            DibujadorConsola.dibujarResumen(f);
        }
        
        System.out.println("\n" + "=".repeat(60));
        System.out.println("DEMOSTRACIÓN DE POLIMORFISMO COMPLETADA");
        System.out.println("=".repeat(60));
    }
}
// fin de la clase Main