class Result {

    /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
        for(int i=0; i<(a.size()/2); i++){
            int temp = a.get(i);
            a.set(i, a.get(a.size() - i - 1));
            a.set(a.size() - i - 1, temp);
        }
        return a;
    }
}