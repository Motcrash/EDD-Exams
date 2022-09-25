import java.util.Arrays;
import java.util.Scanner;

public class Principiante_CompararArreglos {
    public static void inicio() {
        
        Scanner entrada = new Scanner(System.in);
        
        int[] numerosUno = new int[10];
        int[] numerosDos = new int[10];
        
        for (int i = 0; i < numerosUno.length; i++) {
            System.out.print("Digite un numero para el primer arreglo: ");
            numerosUno[i] = entrada.nextInt();
        }
        
        System.out.println("");
        
        for (int i = 0; i < numerosDos.length; i++) {
            System.out.print("Digite un numero para el segundo arreglo: ");
            numerosDos[i] = entrada.nextInt();
        }
        
        System.out.println("");
        
        if(Arrays.equals(numerosUno, numerosDos)){
            for (int i = 0; i < numerosUno.length; i++) {
                System.out.print("[" + numerosUno[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < numerosDos.length; i++) {
                System.out.print("[" + numerosDos[i] + "]");
            }
            System.out.println("");
            System.out.println("Los arreglos son iguales");
            
        }else{
            for (int i = 0; i < numerosUno.length; i++) {
                System.out.print("[" + numerosUno[i] + "]");
            }
            System.out.println("");
            for (int i = 0; i < numerosDos.length; i++) {
                System.out.print("[" + numerosDos[i] + "]");
            }
            System.out.println("");
            System.out.println("Los arreglos no son iguales");
            
        }
        
        entrada.close();
    }
}