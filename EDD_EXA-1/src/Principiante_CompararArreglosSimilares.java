import java.util.Scanner;

public class Principiante_CompararArreglosSimilares{

    public static void inicio(){


        Scanner zeyan = new Scanner(System.in);

        int[] arreglo1, arreglo2;

        arreglo1 = new int[10];
        arreglo2 = new int[10];

        System.out.println("Captura de datos arreglo 1");
        for(int i = 0 ;  i<arreglo1.length; i++){
            arreglo1[i] = zeyan.nextInt();
        }
        System.out.println("Captura de datos arreglo 2");
        for(int i = 0 ;  i<arreglo2.length; i++){
            arreglo2[i] = zeyan.nextInt();
        }
        int contSimilares=0;
        for(int i=0; i<arreglo1.length; i++ ){
            for(int j=0; j<arreglo2.length; j++){
                if(arreglo1[i]==arreglo2[j]) contSimilares++;
            }
        }

        if(contSimilares==arreglo1.length || contSimilares==arreglo2.length) {
            for (int i = 0; i < arreglo1.length; i++) {
                System.out.print("[" + arreglo1[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < arreglo2.length; i++) {
                System.out.print("[" + arreglo2[i] + "]");
            }
            System.out.println();
            System.out.println("Los arreglos son similares");
        }else{
            for (int i = 0; i < arreglo1.length; i++) {
                System.out.print("[" + arreglo1[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < arreglo2.length; i++) {
                System.out.print("[" + arreglo2[i] + "]");
            }
            System.out.println();
            System.out.println("Los arreglos no son similares");
        }


    }


}