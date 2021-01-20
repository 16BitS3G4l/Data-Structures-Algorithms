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

        else if(tree.getRight() == null)
            return "(" + tree.getValue() + "," + serialize(tree.getLeft()) + "," + "N)";
        
        else if(tree.getLeft() == null)
            return "(" + tree.getValue() + "," + "N," + serialize(tree.getRight()) + ")";

        return "(" + tree.getValue() + "," + serialize(tree.getLeft()) + "," + serialize(tree.getRight()) + ")";    
    }

    public static Node deserialize(String tree) {
        // sample input: (root,(left.left,N,(sdf,N,N)),(right.right,N,N))
        Node treeDeserialized = new Node();
        
        return null;
    }

    public static void main(String[] args) {
        Node root = new Node("root");
        root.setLeft(new Node("left.left"));
        root.setRight(new Node("right.right"));
        root.getLeft().setRight(new Node("sdf"));
        System.out.println(serialize(root));

    }    
}
