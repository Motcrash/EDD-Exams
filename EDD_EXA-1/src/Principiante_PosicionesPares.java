public class Principiante_PosicionesPares{
    public static void inicio(){
      int[] arreglo = new int[15];

        int[] arreglo2 = new int[15];
        
        for(int i=0; i<arreglo.length; i++){
            arreglo[i] = (int)(1+Math.random()*100);
        }
        
        for (int i = 0; i < arreglo.length; i++) {
            if (i % 2 == 0 && arreglo[i]%2!=0) {
                do {
                    arreglo2[i] = (int) (1 + Math.random() * 100);
                } while (arreglo2[i] % 2 != 0);
            } else {
                arreglo2[i] = arreglo[i];
            }
        }
        System.out.println("Arreglo original");
        for (int numero : arreglo) {
            System.out.print(numero + " ");
        }
        System.out.println("");
        System.out.println("Arreglo Copia con Pares");
        for (int numero : arreglo2) {
            System.out.print(numero + " ");
        }
    }
}