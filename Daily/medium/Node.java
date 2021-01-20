package medium;

public class Node {
    private String value = 0;
    private Node left = null;
    private Node right = null;

    public Node(String value) {
        this.value = value;
    }

    public Node() {

    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setValue(String value) {
        this.value = value;
    }
    
    public String getValue() {
        return value;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    
}
