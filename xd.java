/**
 * Esta clase representa una calculadora básica que puede realizar operaciones
 * aritméticas simples como suma, resta, multiplicación y división.
 */
public class Calculadora {

  /**
   * Este método suma dos números enteros y devuelve el resultado.
   *
   * @param a el primer número a sumar
   * @param b el segundo número a sumar
   * @return la suma de los dos números
   */
  public int sumar(int a, int b) {
    return a + b;
  }

  /**
   * Este método resta dos números enteros y devuelve el resultado.
   *
   * @param a el primer número (minuendo)
   * @param b el segundo número (sustraendo)
   * @return la diferencia entre los dos números
   */
  public int restar(int a, int b) {
    return a - b;
  }

  /**
   * Este método multiplica dos números enteros y devuelve el resultado.
   *
   * @param a el primer número a multiplicar
   * @param b el segundo número a multiplicar
   * @return el producto de los dos números
   */
  public int multiplicar(int a, int b) {
    return a * b;
  }

  /**
   * Este método divide dos números enteros y devuelve el resultado.
   *
   * @param a el dividendo
   * @param b el divisor
   * @return el cociente de la división
   * @throws IllegalArgumentException si el divisor es cero
   */
  public int dividir(int a, int b) {
    if (b == 0) {
      throw new IllegalArgumentException("El divisor no puede ser cero");
    }
    return a / b;
  }
}
