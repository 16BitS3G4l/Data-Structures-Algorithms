package medium;

import java.util.Stack;

/*
    Problem Statement: 
    Given the root to a binary tree, implement serialize(root) , which
    serializes the tree into a string, and deserialize(s) , which deserializes
    the string back into the tree.
*/
public class ProblemThree {

    private static int position = 0; // current position in the tree 
    private static String serializedTree = "";

    public static String serialize(Node tree) {
        if(tree.getLeft() == null && tree.getRight() == null)
            return "(" + tree.getValue() + "," + "N,N)";

        else if(tree.getRight() == null)
            return "(" + tree.getValue() + "," + serialize(tree.getLeft()) + "," + "N)";
        
        else if(tree.getLeft() == null)
            return "(" + tree.getValue() + "," + "N," + serialize(tree.getRight()) + ")";

        return "(" + tree.getValue() + "," + serialize(tree.getLeft()) + "," + serialize(tree.getRight()) + ")";    
    }

    public static Node deserialize(String tree) {
        Node deserializedTree = null;
        String treeCopy = "";
        String value = "";

        if(tree.charAt(position) == '(') {
            deserializedTree = new Node();

            treeCopy = tree.substring(position + 1); // "remove" the paranthesis denoting it's the start of a node

            int positionOfNextComma = treeCopy.indexOf(",");
            value = treeCopy.substring(0, positionOfNextComma);
            deserializedTree.setValue(value);

            position = positionOfNextComma + 1;

            deserializedTree.setLeft(deserialize(treeCopy));
            deserializedTree.setRight(deserialize(treeCopy));
        } else if(tree.charAt(position) == 'N' && tree.charAt(position + 1) == ',' && tree.contains("(")) {
            position += 2;
        } else if(tree.charAt(position) == 'N' && tree.charAt(position + 1) == ')' && tree.contains("(")) {
            position = tree.indexOf("(");
        }

        return deserializedTree;
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.setLeft(new Node("1"));
        root.setRight(new Node("2"));
        root.getLeft().setRight(new Node("3"));
        root.getLeft().getRight().setLeft(new Node("4"));
        root.getLeft().setLeft(new Node("5"));
        System.out.println(serialize(root));

        serializedTree = serialize(root);
        Node tree = deserialize(serializedTree);

        System.out.println(serialize(tree));
/* 
        Node newRoot = new Node("4");
        newRoot.setLeft(new Node("3"));
        newRoot.setRight(new Node("2"));
        newRoot.getLeft().setRight(new Node("1"));
        newRoot.getRight().setRight(new Node("45"));

        System.out.println(serialize(newRoot));
        Node tree = deserialize(serialize(newRoot)); */

    }    
}
