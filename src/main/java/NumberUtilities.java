


public class NumberUtilities {

    public static String getRange(int stop) {
        String results = "";
        for (int x = 0; x < stop; x++) {
            results = results + x;
        }
        return results;
    }


    public static String getRange(int start, int stop) {
        String results = "";
        for (int x = start; x < stop; x++) {
            results = results + x;
        }
        return results;
    }


    public static String getRange(int start, int stop, int step) {
        String results = "";
        for (int x = start; x < stop; x = step + x) {
            results = results + x;
        }

        return results;
    }

    public static String getEvenNumbers(int start, int stop) {
        String results = "";
        for (int x = start; x < stop; x++) {

            if (x % 2 == 0) {
                results = results + x;
            }
        }
        return results;
    }


    public static String getOddNumbers(int start, int stop) {

        String results = "";
        for (int x = start; x < stop; x++) {

            if (x % 2 != 0) {
                results = results + x;
            }


        }

        return results;
    }


    public static String getExponentiations(int start, int stop, int exponent) {
        String results = "";
        for (int x = start; x <= stop; x++) {

            results = results +(int) Math.pow(x ,exponent);


        }


        return results;
    }
}
