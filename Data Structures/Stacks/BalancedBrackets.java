class Result {

    /*
     * Complete the 'isBalanced' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String isBalanced(String s) {
        Stack<Character> brackets = new Stack<>();
        
        for(int i=0; i <s.length(); i++){
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{'){
                brackets.push(s.charAt(i));
            } else if(s.charAt(i) == ')'){
                if(!brackets.isEmpty() && brackets.peek() == '('){
                    brackets.pop();
                } else {
                    return "NO";
                }
            } else if(s.charAt(i) == ']'){
                if(!brackets.isEmpty() && brackets.peek() == '['){
                    brackets.pop();
                } else {
                    return "NO";
                }
            }else if(s.charAt(i) == '}'){
                if(!brackets.isEmpty() && brackets.peek() == '{'){
                    brackets.pop();
                } else {
                    return "NO";
                }
            }
        }
        
        if(brackets.size() == 0){
            return "YES";
        } else {
            return "NO";
        }
    }
}