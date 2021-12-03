public class Solution {

    // Complete the matchingStrings function below.
    static int[] matchingStrings(String[] strings, String[] queries) {
        int[] result = new int[queries.length];
        for(int i=0; i<queries.length ; i++){
            int count = 0;
            for(int j=0; j<strings.length; j++){
                if(strings[j].equals(queries[i])){
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }
}