public class Array041 {
    public static void main(String[] args) {
        /*REALIZE UN PROGRAMA QUE GENERE 8 NUMEROS ENTEROS ALEATORIOS Y QUE LUEGO MUESTRE ESOS NUMEROS JUNTOS */
        //A LA PALABRA PAR O IMPOAR SEGUN CORRESPONDA

        int[] numeros = new int[8];

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int)(Math.random() *51);
            System.out.print(numeros[i]+ "-");
        }
        
        for (int i = 0; i < numeros.length; i++); {
            if (numeros[i] % 2 == 0) {
                System.out.println(numeros[i] + " par");
            } else {
                System.out.println(numeros[i] + " impar");
            }
        }
    }
}
