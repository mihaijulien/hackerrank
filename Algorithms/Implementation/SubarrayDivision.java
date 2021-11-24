class Result {

    /*
     * Complete the 'birthday' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY s
     *  2. INTEGER d
     *  3. INTEGER m
     */

    public static int birthday(List<Integer> s, int d, int m) {
        int counter = 0;
        if(s.size() == 1 && s.get(0) == d){
            return ++counter;
        }
        for(int i=0; i<=s.size() - m; i++){
               List<Integer> sublist = s.subList(i, i+m);
               if(sublist.stream().mapToInt(Integer::valueOf).sum() == d){
                   counter++;
               }
        }
        return counter;
    }
}