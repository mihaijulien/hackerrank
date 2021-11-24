class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        Collections.sort(arr);
        long min = arr.stream().mapToLong(Integer::valueOf).sum() - arr.get(arr.size() - 1);
        long max = arr.stream().mapToLong(Integer::valueOf).sum() - arr.get(0);
        
        System.out.print(min + " " + max);
    }
}