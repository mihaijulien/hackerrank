/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

public static void postOrder(Node root) {
    if(root == null){
        return;
    }
    
    postOrder(root.left);
    System.out.print(root.data + " ");
    postOrder(root.right);
}