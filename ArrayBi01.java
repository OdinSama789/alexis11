public class ArrayBi01 {
    público  estático  vacío  principal ( String [] args ) {
        int [][] n = nuevo  int [ 3 ][ 2 ];
        int  fila , columna ;
        //Llenar el arreglo 3x2
        para ( fila = 0 ; fila < 3 ; fila ++) {
            para ( columna = 0 ; columna < 2 ; columna ++) {
                n [ fila ][ columna ] = ( int ) ( Math . random () * 10 );
            }
        }
        //Mostrar el arreglo
        para ( fila = 0 ; fila < 3 ; fila ++) {
            Sistema . afuera . imprimir ( "Fila: " + fila );
            para ( columna = 0 ; columna < 2 ; columna ++) {
                Sistema . afuera . printf ( "%10d " , n [ fila ][ columna ]);
            }
            Sistema . afuera . imprimir ();
        }
    }
}
