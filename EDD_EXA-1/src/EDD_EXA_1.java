import java.util.Scanner;

public class EDD_EXA_1 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        
        int option;
        boolean repeat = true;
        do{
            System.out.println();
            System.out.println("Seleccione qué programa quiere ejecutar: \n1) Juego de ahorcado \n2) Comparar arreglo \n3) Borrar valores \n4) Verificar Suma Matriz" + 
            "\n5) Arreglo similar \n6) Filtrar valores \n7) Posiciones pares \n9) Terminar programa" );
            option = input.nextInt();
            switch (option) {
                case 1:
                    Avanzado_Ahorcado.inicio();
                    break;
                case 2:
                    Principiante_CompararArreglos.inicio();
                    break;
                case 3:
                    Intermedio_BorrarValores.inicio();
                    break;  
                case 4:
                    Principiante_VerificarSumaMatriz.inicio();
                    break;  
                case 5: 
                    Principiante_CompararArreglosSimilares.inicio();
                    break;
                case 6:
                    Principiante_FiltrarValores.inicio();
                    break;
                case 7:
                    Principiante_PosicionesPares.inicio();
                    break;
                case 9: 
                    System.out.println("\t\tFin del programa");
                    System.out.println();
                    repeat = false;
                    break;
                default: 
                    System.out.println("Elija una opción válida");
                    break;
            }
            if (option<9) {
                System.out.println("Fin de la ejecución");
            }
        }while(repeat == true);
    }
}
