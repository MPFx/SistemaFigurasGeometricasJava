package enums;

/**
 * Enumeración que define los tipos de figuras geométricas disponibles.
 * Cada tipo determina la forma de cálculo de área y perímetro.
 * 
 * @author ISC Israel de Jesús Mar Parada (MPFx++)
 * @version 1.0.0
 * @since 15/01/13
 */
public enum TipoFigura {
    /** Figura circular */
    CIRCULO,
    /** Figura rectangular */
    RECTANGULO,
    /** Figura triangular */
    TRIANGULO,
    /** Figura cuadrada (caso especial de rectángulo) */
    CUADRADO,
    /** Figura elíptica */
    ELIPSE,
    /** Figura trapezoidal */
    TRAPECIO
}
// fin de la clase TipoFigura