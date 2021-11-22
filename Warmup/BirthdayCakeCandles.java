class Result {

    /*
     * Complete the 'birthdayCakeCandles' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY candles as parameter.
     */

    public static int birthdayCakeCandles(List<Integer> candles) {
    // Write your code here
        Map<Integer, Integer> candleCount = new HashMap<>();
        
        for(int i= 0; i<candles.size(); i++){
            candleCount.put(candles.get(i), candleCount.getOrDefault(candles.get(i), 0) + 1);
        }
        
        List<Integer> result = new ArrayList<>(candleCount.keySet());
        Collections.sort(result, (v1, v2) -> candleCount.get(v2) - candleCount.get(v1));
        
        return candleCount.get(result.get(0));
    }
}