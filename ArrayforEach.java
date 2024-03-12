public class ArrayforEach {
    public static void main(String[] args) {
    
    //Para no tener errores con los indices de  un arreglo usaremos la estructura ForEach
    double[] notas = new double[4];

    System.out.println("Para calcular la nota media necesito saber\n la nota de cada examen");

    for (int i = 0;i < 4; i++) {
        System.out.print("Nota nº"+(i+1)+": ");
        notas[i] = Double.parseDouble(System.console().readLine());
    }
    double suma = 0;

    for (double n : notas) {
        System.out.print(n + " ");
        suma = suma + n;
        System.out.println("\nEl promedio es: "+suma/4);
    }
}
}