package Ejercicios10;

public class ejercicio01 {
    public static void main(String[] args) {
        int[][] num = {
            {0 , 30, 2 ,  0 ,  0, 5 },
            {75, 0 , 0 ,  0,   0, 12},
            {  0, 0, -2,  9,   0 , 11},
        };

        num[0][1]=30;

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

