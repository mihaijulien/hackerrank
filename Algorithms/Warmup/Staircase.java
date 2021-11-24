class Result {

    /*
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        
        for(int i=0; i < n; i++){
            for(int j=0; j < n - i - 1; j++){
                System.out.print(" ");
            }
            for (int j = n; j > n-i-1; j--) {
                System.out.print("#");
            }
        System.out.print("\n");
        }
    }
}