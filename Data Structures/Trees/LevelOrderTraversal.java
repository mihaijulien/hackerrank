/* 

class Node 
	int data;
	Node left;
	Node right;
*/
public static void levelOrder(Node root) {
    int height = getHeight(root);
    for(int i=0; i<=height; i++){
        currentLevel(root, i);
    }
}

private static void currentLevel(Node root, int level){
    if (root == null){
        return;
    }
    if(level == 0){
        System.out.print(root.data + " ");
    } else {
        currentLevel(root.left, level-1);
        currentLevel(root.right, level -1);
    }
}

private static int getHeight(Node root){
    if(root == null){
        return -1;
    }
    
    int left = getHeight(root.left);
    int right = getHeight(root.right);
    
    return Math.max(left, right) + 1;
}