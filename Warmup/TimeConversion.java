class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        DateFormat df = new SimpleDateFormat("hh:mm:ssa");
        Date result = new Date();
        try {
        result =  df.parse(s);
        } 
        catch (Exception e) { }
        DateFormat dr =  new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        
        return (String) dr.format(result);
    }
}