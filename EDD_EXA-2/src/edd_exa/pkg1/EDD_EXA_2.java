package edd_exa.pkg1;

import java.util.Scanner;

public class EDD_EXA_2 {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {
        BinaryTree tree1 = new BinaryTree();
        String data = "";
        boolean repeat = true;
        while(repeat){
            System.out.print("Ingrese un dato de tipo String: ");   
            data = scan.next();
            tree1.addNode(data);
            repeat = menu(); 
        }
        result(tree1);
        
    }
    
    public static boolean menu() {
        String option = "";
        System.out.println("¿Desea agregar otro dato? \na) Sí \tb) No");
        option = scan.next();
        while(!option.equalsIgnoreCase("a") && !option.equalsIgnoreCase("b")){
            System.out.println("Ingrese una opción válida:\na) Sí \tb) No");
            option = scan.next();
        }
        if(option.equalsIgnoreCase("a")){
            return true;
        }else return false;
    }

    public static void result(BinaryTree tree) {
        System.out.print("PreOrder: ");tree.preOrder();
        System.out.println();
        System.out.print("inOrder: ");tree.inOrder();
        System.out.println();
        System.out.print("PostOrder: " );tree.postOrder();
        System.out.println();
        System.out.println("Lista: ");tree.getInOrderList().print();
    }
}
