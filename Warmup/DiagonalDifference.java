class Result {

    /*
     * Complete the 'diagonalDifference' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts 2D_INTEGER_ARRAY arr as parameter.
     */

    public static int diagonalDifference(List<List<Integer>> arr) {
        
        int first = 0;
        int second = 0;
        
        for(int i=0; i < arr.size(); i++){
            first += arr.get(i).get(i);
            second += arr.get(i).get(arr.size()-1-i);
        }
        
        return Math.abs(first - second);
    }

}