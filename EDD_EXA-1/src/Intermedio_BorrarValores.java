import java.util.Scanner;

public class Intermedio_BorrarValores{
    public static void inicio() {
        Scanner input = new Scanner(System.in);
        int[] arrayNums = new int[15];
        int num;
        fillArray(arrayNums);
        printArray(arrayNums);
        for (int i = 0; i < arrayNums.length; i++) {
            System.out.print("Introduzca un número: ");
            num = input.nextInt();
            compareNum(arrayNums, num);
            printArray(arrayNums);
        }
    }

    public static void fillArray(int[] arrayNums) {
        for(int i = 0 ;  i < arrayNums.length; i++){
            arrayNums[i] = (int) (1+(Math.random())*100);
        }
    }

    public static void compareNum(int[] arrayNums, int num) {
        for (int i = 0; i < arrayNums.length; i++) {
            if(num == arrayNums[i]){
                for (int j = i; j < arrayNums.length ; j++) {
                    if(j<arrayNums.length-1){
                        arrayNums[j] = arrayNums[j+1]; 
                    }else{
                        arrayNums[j] = 0;
                    }
                }
            }
        }
    }

    public static void printArray(int[] arrayNums) {
        for (int i = 0; i < arrayNums.length; i++) {
            if (arrayNums[i]==0) {
                System.out.print("[ ]");
            }else{
                System.out.print("["+arrayNums[i]+"]");
            }
        }
        System.out.println();
    }
    
    
}