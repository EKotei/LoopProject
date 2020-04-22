 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
      String results = "";
        for(int x = 0; x < numberOfStars; x++){
            results = results + "*";
        }
        return results;
    }
    
    public static String getTriangle(int numberOfRows) {
        String results = "";
        for(int x = 1; x<= numberOfRows; x++){
            results = results + getRow(x) + '\n';
        }
        return results;
    }


    public static String getSmallTriangle() {
        return getTriangle(4);
    }

    public static String getLargeTriangle() {
        return getTriangle(9);
    }
}
