/*
class Node 
	int data;
	Node left;
	Node right;
*/
public static Node lca(Node root, int v1, int v2) {

    while(root != null){
        if(v1 < root.data && v2 < root.data){
            root = root.left;
        } else if(v1 > root.data && v2 > root.data){
            root = root.right;
        } else {
            return root;
        }
    }
    return root;
}