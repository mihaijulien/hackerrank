class Result {

    /*
     * Complete the 'extraLongFactorials' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void extraLongFactorials(int n) {
        BigInteger result =  BigInteger.ONE;
        for(int i=2; i<=n; i++){
            result = result.multiply(BigInteger.valueOf(i));
        }
        
        System.out.println(result);
    }

}
