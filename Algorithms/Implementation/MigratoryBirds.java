class Result {

    /*
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */
     

    public static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Integer> frequency = new HashMap<>();
        for(int i = 0; i<arr.size(); i++){
            frequency.put(arr.get(i), frequency.getOrDefault(arr.get(i), 1) + 1);
        }
        int maximum = 0;
        int id = -1;
        for(Map.Entry<Integer, Integer> entry : frequency.entrySet()){
            if(entry.getValue() > maximum){
                maximum = entry.getValue();
                id = entry.getKey();
            } 
        }
        return id;
    }
}
