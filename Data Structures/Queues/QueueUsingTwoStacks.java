public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        MyQueue queue = new MyQueue();
        
        Scanner scanner = new Scanner(System.in);
        int query = scanner.nextInt();
        
        for(int i = 0; i < query; i++) {
            
            int queryType = scanner.nextInt();
            
            if(queryType == 1) {
                int x = scanner.nextInt();
                queue.enque(x);
            }
            
            else if(queryType == 2) {
                queue.deque();
            }
            else { 
                System.out.println(queue.peek());
            }
        }
        
        scanner.close();
    }
    
    static class MyQueue{
        Stack<Integer> mainStack;
        Stack<Integer> helperStack;
        
        public MyQueue(){
            this.mainStack = new Stack<>();
            this.helperStack = new Stack<>(); 
        }
        
        public void enque(int key){
            if(mainStack.isEmpty()){
                mainStack.push(key);
            } else {
                helperStack.push(mainStack.pop());
                mainStack.push(key);
                mainStack.push(helperStack.pop());
            }
        }
        
        public void deque(){
            mainStack.pop();
        }
        
        public int peek(){
            return mainStack.peek();
        }
    } 
}