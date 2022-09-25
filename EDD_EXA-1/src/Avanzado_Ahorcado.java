import java.util.Arrays;
import java.util.Scanner;

public class Avanzado_Ahorcado{
    static Scanner mot = new Scanner(System.in);

    public static int wordSearch(String word, String aWord, int oportunity){
        System.out.print("Escriba la palabra: ");
        aWord = mot.next();
        if(aWord.equalsIgnoreCase(word)){
            oportunity = -1;
        }else{
            oportunity = 0;
        }
        return oportunity;
    }
    public static int letterSearch(String aWord, char[][] animals, int nRow, String letter, String[] progress, char[] charWord, boolean repeat, String comparison, String word, int oportunity){
        repeat=false;
        System.out.println("¿Qué letra quiere buscar?");
        aWord = mot.next();
        System.out.println("");
        for (int j = 0; j < animals[nRow].length; j++) {
            letter = String.valueOf(animals[nRow][j]);
            if(aWord.equalsIgnoreCase(letter)){
                progress[j] = "[ "+letter+" ]";
                charWord[j] = letter.charAt(0);
                repeat = true;
            }
        }
        comparison = new String(charWord);
        System.out.println(Arrays.toString(progress));
        System.out.println("");
        if(repeat==false){
            oportunity--;
            System.out.println("Esa letra no está en la palabra");
            System.out.println("");
            System.out.println("Le quedan "+oportunity+" intentos");
        }else if(comparison.equalsIgnoreCase(word)){
            oportunity=-1;
        }else if(repeat==true){
            System.out.println("Esa letra está en la palabra");
        }
        return oportunity;
    }
    
    public static void inicio() {
        boolean repeat = false, playAgain=false;
        String election, knowWord, aWord, word, letter, comparison;
        int oportunity=4, nRow;
        double dRow;
        char animals [][] = {{'M','u','r','c','i','e','l','a','g','o'},{'P','e','r','r','o'},
        {'J','i','r','a','f','a'},{'G','a','t','o'},
        {'O','s','o'},{'R','i','n','o','c','e','r','o','n','t','e'},
        {'S','e','r','p','i','e','n','t','e'},{'Z','o','r','r','o'},
        {'L','o','b','o'},{'P','a','l','o','m','a'}};
        do{
            letter="";aWord="";word="";comparison="";repeat=true;
            dRow = (Math.random()*9);
            nRow = (int) dRow;
            String progress[] = new String[animals[nRow].length];
            char charWord[] = new char[animals[nRow].length];
                for (int i = 0; i < animals[nRow].length; i++) {
                    word += animals[nRow][i];
                    progress[i] = "[  ]";
                }
                System.out.println(Arrays.toString(progress));
                System.out.println("");
                while(oportunity>0){
                    System.out.println("¿Sabe la palabra?\n  a) Sí\n  b)No");
                    knowWord = mot.next();
                    System.out.println("");
                    switch(knowWord){
                        case "a":
                            oportunity = wordSearch(word, aWord, oportunity);
                            break;

                        case "b":
                            oportunity = letterSearch(aWord, animals, nRow, letter, progress, charWord, repeat, comparison, word, oportunity);
                            break;
                        default:
                            System.out.println("Elija una opción válida");
                    }
                }
                    if(oportunity==0){
                        System.out.println("");
                        System.out.println("\t Has perdido");
                        System.out.println("");
                        System.out.println("¿Desea volver a intentar?\n  a) Sí\n  b)No");
                        election = mot.next();
                        System.out.println("");
                        switch(election){
                            case "a":
                                playAgain = true;
                                oportunity = 4;
                                break;
                            case "b":
                                System.out.println("Juego finalizado");
                                playAgain = false;
                                break;
                            default:
                                System.out.println("Elija una opción válida");
                                break;
                        }
                    }else if(oportunity==-1){
                        System.out.println("");
                        System.out.println("\t Has ganado");
                        System.out.println("");
                        System.out.println("¿Desea volver a jugar?\n  a) Sí\n  b)No");
                        election = mot.next();
                        System.out.println("");
                        switch(election){
                            case "a":
                                playAgain = true;
                                oportunity = 4;
                                break;
                            case "b":
                                System.out.println("Juego finalizado");
                                playAgain = false;
                                break;
                            default:
                                System.out.println("Elija una opción válida");
                                break;
                        }
                    }
        }while(playAgain==true);
        
    }
    
}