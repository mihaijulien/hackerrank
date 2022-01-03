class Result {

    /*
     * Complete the 'gridChallenge' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING_ARRAY grid as parameter.
     */

    public static String gridChallenge(List<String> grid) {
        // check horizontally
        for(int i=0; i<grid.size(); i++){
            String s = grid.get(i);
            if(!isAscending(s)){
                char[] chars = s.toCharArray();
                Arrays.sort(chars);
                grid.set(i, String.valueOf(chars));
            }
        }
        
        // check vertically
        StringBuilder vertical = new StringBuilder();
        for(int i=0; i<grid.get(0).length(); i++){
            for(String s : grid){
                vertical.append(s.charAt(i));   
            }
            System.out.println(vertical.toString());
            if(!isAscending(vertical.toString())){
                return "NO";
            }
            
            vertical.setLength(0);
            vertical.trimToSize();
        }
        
        return "YES";
    }
}