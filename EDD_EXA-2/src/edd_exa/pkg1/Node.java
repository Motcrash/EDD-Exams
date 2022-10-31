package edd_exa.pkg1;

public class Node {
    private String value;
    private Node leftNode;
    private Node rightNode;
    private Node next;
    private Node previous;

    public Node(){
        this.value = null;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Node(String value){
        this.value = value;
        this.rightNode = null;
        this.leftNode = null;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    } 

    public Node getLeftNode() {
        return leftNode;
    }
    
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public String getValue() {
        return value;
    }
    
    public void setValue(String value) {
        this.value = value;
    }

        public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next =  next;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous) {
        this.previous = previous;
    }
}