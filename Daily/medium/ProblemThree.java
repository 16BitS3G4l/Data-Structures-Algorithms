package medium;

/*
    Problem Statement: 
    Given the root to a binary tree, implement serialize(root) , which
    serializes the tree into a string, and deserialize(s) , which deserializes
    the string back into the tree.
*/
public class ProblemThree {
    
    public static String serialize(Node tree) {
        if(tree.getLeft() == null && tree.getRight() == null)
            return "(" + tree.getValue() + "," + "N,N)";

        return "'";
    }

    public static Node deserialize(String tree) {

        return null;
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.setLeft(new Node("left.left"));
        root.setRight(new Node("right.right"));

        System.out.println(serialize(root));

    }    
}
