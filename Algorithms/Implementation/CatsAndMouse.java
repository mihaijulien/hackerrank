public class Solution {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        return Math.abs(z - x) < Math.abs(y - z) ? "Cat A" : (Math.abs(z - x) >  Math.abs(y - z) ? "Cat B" : "Mouse C");
    }
}
