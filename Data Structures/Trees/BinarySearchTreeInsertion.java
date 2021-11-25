 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

public static Node Insert(Node root, int value) {
    Node newNode = new Node();
    newNode.data = value;

    if (root == null) {       
        return newNode;
    }

    Node iterator = root;
    while (iterator != null) {
        if (value < iterator.data) {
            if (iterator.left == null) {
                iterator.left = newNode;
                break;
            }
            iterator = iterator.left;
        } else {
            if (iterator.right == null) {
                iterator.right = newNode;
                break;
            }
            iterator = iterator.right;
        }
    }
    return root;
}