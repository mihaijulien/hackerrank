class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<grades.size(); i++){
            if(grades.get(i) < 38){
                result.add(grades.get(i));
            } else {
                if(getNextMultipleOfFive(grades.get(i)) - grades.get(i) < 3){
                    result.add(getNextMultipleOfFive(grades.get(i)));
                } else {
                    result.add(grades.get(i));
                }
            }
        }
        for(int i=0; i<result.size(); i++){
            System.out.println(result.get(i));
        }
        return result;
    }
        
    private static int getNextMultipleOfFive(int n){
        for(int i=0; i<5; i++){
            if((n + i) % 5 == 0){
                return i + n;
            }
        }
        return 0;
    }
}