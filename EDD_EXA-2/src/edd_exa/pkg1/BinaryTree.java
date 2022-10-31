package edd_exa.pkg1;

public class BinaryTree{
    private Node root;
    private List inOrderList;

    public BinaryTree(){
        root = null;
        inOrderList  = new List();
    }

    public BinaryTree(String data){
        root.setValue(data);
    }

    public void addNode(String data) {
        Node newNode = new Node(data);
        if(root == null){
            root = newNode;
        }else addRec(data, root);
    }

    private void addRec(String value, Node actualRoot){
        Node newNode = new Node(value);
        if(value.compareTo(actualRoot.getValue()) < 0){
            if(actualRoot.getLeftNode() == null){
                actualRoot.setLeftNode(newNode);
            }else{
                addRec(value, actualRoot.getLeftNode());
            }
        }else if(value.compareTo(actualRoot.getValue()) > 0){
            if(actualRoot.getRightNode() == null){
                actualRoot.setRightNode(newNode);
            }else{
                addRec(value, actualRoot.getRightNode());
            }
        }else {System.out.println("Elemento repetido");}
    }

    public void inOrder() {
        inOrderRec(root);
    }

     private void inOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            inOrderRec(actualRoot.getLeftNode());
            System.out.print(actualRoot.getValue()+ " - "); 
            inOrderList.add(actualRoot.getValue());
            inOrderRec(actualRoot.getRightNode());
        }
    }

    public void postOrder() {
        postOrderRec(root);

    }

    private void postOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            postOrderRec(actualRoot.getLeftNode());
            postOrderRec(actualRoot.getRightNode());
            System.out.print(actualRoot.getValue()+ " - "); 
        }
    }

    public void preOrder() {
        preOrderRec(root);
    }

    private void preOrderRec(Node actualRoot) {
        if(actualRoot!=null){
            System.out.print(actualRoot.getValue()+ " - "); 
            preOrderRec(actualRoot.getLeftNode());
            preOrderRec(actualRoot.getRightNode());
        }
    }

    public List getInOrderList() {
        return inOrderList;
    }
}