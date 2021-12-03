class Result {

    /*
     * Complete the 'rotateLeft' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER d
     *  2. INTEGER_ARRAY arr
     */

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {
        while(d>0){
            int first = arr.get(0);
            for(int i=0; i<arr.size()-1; i++){
                arr.set(i, arr.get(i+1));
            }
            arr.set(arr.size()-1, first);
            d--;
        }

        return arr;
    }
}