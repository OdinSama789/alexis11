package Clases6Parcial2;

public class ejercicio5 {
    public static void main(String[] args) {
        int n = 0;
        int cuentaNumeros = 0;
        
        while (n != 24) {
          n = (int)(Math.random() * 51) * 2;
          System.out.print(n + " ");
          cuentaNumeros++;
        }
        System.out.println("\nSe han generado " + cuentaNumeros + " números.");
      }
}

