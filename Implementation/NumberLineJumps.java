class Result {

    /*
     * Complete the 'kangaroo' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER x1
     *  2. INTEGER v1
     *  3. INTEGER x2
     *  4. INTEGER v2
     */

    public static String kangaroo(int x1, int v1, int x2, int v2) {
        // if the speed of the second kangaroo is greater or equal to the first one
        // then the first can never catch up
        if(v2 > v1 || v2 == v1){
            return "NO";
        }
        // basically, solving x1 + y * v1 = x2 + y * v2 where "y" is the number of jumps
        return (x1-x2) % (v2 -v1) == 0 ? "YES" : "NO";
    }
}