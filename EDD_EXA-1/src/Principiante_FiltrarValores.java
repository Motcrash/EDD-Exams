public class Principiante_FiltrarValores {
    public static void inicio() {
     int[] array = new int[15];
        for (int i = 0; i < array.length; i++) {
            int valor;
            do {
                valor = (int) (1 + Math.random() * 100);
                while(numExiste(valor,i,array)){
                      valor = (int) (1 + Math.random() * 100);
                }
            } while (valor % 2 != 0 );
            array[i] = valor;
        }
        for (int arreglo : array) {
            System.out.print(arreglo + " ");
        }
    }    
    public static boolean numExiste(int valor, int i, int[] arreglo){
        for(int j=0; j<i; j++){
            if(valor==arreglo[j]) return true;
        }
        return false;
    }
}