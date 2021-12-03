class Result {

    /*
     * Complete the 'minimumNumber' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. STRING password
     */

    public static int minimumNumber(int n, String password) {
        int digit = 0;
        int lowerCase = 0;
        int upperCase = 0;
        int special = 0;
        
        String specialChars = "!@#$%^&*()-+";
        
        for(int i=0; i<password.length(); i++){
            char c = password.charAt(i);
            if(Character.isDigit(c)){
                digit++;
            }
            if(Character.isUpperCase(c)){
                upperCase++;
            }
            if(Character.isLowerCase(c)){
                lowerCase++;
            }
            if(specialChars.contains(String.valueOf(c))){
                special++;
            }
        }
        
        int missingChar = 0;
        
        if(digit == 0){
            missingChar++;
        }
        if(upperCase == 0){
            missingChar++;
        }
        if(lowerCase == 0){
            missingChar++;
        }
        if(special == 0){
            missingChar++;
        }
        
        int missingLength = (password.length() - 6 < 0) ? 6 - password.length(): 0;
        if (missingChar < missingLength) {
            return missingLength;
        }
        return missingChar;
    }
}