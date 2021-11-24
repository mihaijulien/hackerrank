class Result {

    /*
     * Complete the 'reverse' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts INTEGER_SINGLY_LINKED_LIST llist as parameter.
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        
        Stack<Integer> stack = new Stack<>();
        SinglyLinkedListNode temp = head;
        
        while(temp != null){
            stack.push(temp.data);
            temp = temp.next;
        }
        SinglyLinkedListNode current = head;
        
        while(!stack.isEmpty()){
            current.data = stack.pop();
            current = current.next;
        }
        return head;
    }      
}