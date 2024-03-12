public class Arrayejercicio01 {
    public static void main(String[] args) {
        //Realiza un progama que rellene un array de 6 filas por 10 columnas
        //con numeros enteros positivos comprendidos entre 0 y 100 (ambos incluidos). A
        //continuacion, 
        int[][] n = new int[6][10];
        int fila , columna;

        for (fila = 0; fila < 6; fila++) {
            for (columna = 0 ; columna < 10; columna++) {
                n[fila][columna] = (int)(Math.random()*1000);
            }
        }
        for (fila = 0 ; fila < 6;fila++) {
            System.out.print("\nfila: "+fila+": ");
            for (columna = 0; columna < 10; columna++) {
                System.out.print(n[fila][columna]+"\t");
            }
        }
        System.out.println();
    }
}