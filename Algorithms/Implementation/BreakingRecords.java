class Result {

    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
        Stack<Integer> min = new Stack<>();
        Stack<Integer> max = new Stack<>();
        for(int i : scores){
            if(min.isEmpty() && max.isEmpty()){
                min.push(i);
                max.push(i);
            }
            if(i < min.peek()){
                min.push(i);
            } else if(i > max.peek()){
                max.push(i);
            }
        }
        return Arrays.asList(new Integer[] {max.size() - 1, min.size() - 1});
    }

}