import java.text.DecimalFormat;
import java.lang.Math;
public class LinearEqaution {
    // Create a bunch of variables
    // Decimal format for formatting
    DecimalFormat dc1 = new DecimalFormat("#.00");
    private int x1; // First x coordinate
    private int x2; // Second x coordinate
    private int y1; // First y coordinate
    private int y2; // Second y coordinate
    private int changeInX;
    private int changeInY;
    private double slopeValue; // Slope
    private String slopeString; // For eqaution
    private double yIntercept; // y-intercept
    private String equation; // string of equation 
    private double distanceBetweenPoints; // distance

    // Use constructor to set up instance variables
	public LinearEqaution(int x1, int y1, int x2, int y2) {
this.x1 = x1;
this.y1 = y1;
this.x2 = x2;
this.y2 = y2;
changeInX = x2 - x1;
changeInY = y2 - y1;

slopeValue = (double) (changeInY) / (double) (changeInX);
slopeString = (changeInY) + "/" + (changeInX);
yIntercept = y1 - (slopeValue * x1);

// y = mx + b
equation = "y = " + slopeString + "x + " + yIntercept;

// Find distance with methods from math class
distanceBetweenPoints = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
    }

    public String toString() {
        String returnedFirstPoint = "First point: (" + x1 + ", " + y1 + ")";
        String returnedSecondPoint = "\nSecond point: (" + x2 + ", " + y2 + ")";
        String returnedSlope = "\nSlope of line: " + dc1.format(slopeValue);
        String returnedYIntercept = "\nY-intercept: " + dc1.format(yIntercept);
        String returnedEquation = "\nSlope intercept form: " + equation;
        String returnedDistanceBetweenPoints = "\nDistance between points: " + dc1.format(distanceBetweenPoints);
        return returnedFirstPoint + returnedSecondPoint + returnedSlope + returnedYIntercept + returnedEquation + returnedDistanceBetweenPoints;
    }


    public String solveWithThirdCoordinate(int x) {
double thirdCoordX = x;
double thirdCoordY = (slopeValue * x) + yIntercept;
String thirdCoordPoint = "(" + thirdCoordX + "," + thirdCoordY + ")";
return thirdCoordPoint;
    }

    public String createNiceSlope(int x, int y) {
        // This method will take in coordinates and return nice fractions
        int returnedNumerator = changeInY;
        int returnedDenominator = changeInX;
        for (int gcf = 0; gcf < Math.abs(returnedDenominator) && gcf < Math.abs(returnedNumerator); gcf++) {
            // Simplification
            if gcf == Math.abs(returnedDenominator);
            // Then divide them to get whole number
        }
	    else
        changeInX / gcf;
        changeInY / gcf;

        // Negatives
        if changeInX < 0 {
            changeInX and changeInY multiplied by - 1
        }

        // Return
        if changeInY = 1 && changeInX = 1
        return nothing
	    else if changeInY = -1 && changeInX = 1
        return -
            else return "" + changeInY + "/" + changeInX
    }

    public string niceYIntercept() {
        if yIntercept.equals(0)
        return nothing
        if yIntercept < 0:
        return negative value

        public string equation()
        using slope and yintercept
        if slope == 0 && yintercept == 0
        return equation with y = 0
        if slope == 0
        return equation with y = y intercept
        if yintercept == 0
        return equation with y = slope


    }



}
