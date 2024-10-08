import java.text.DecimalFormat;
import java.lang.Math;
public class LinearEqaution {
    // Create a bunch of variables
    // Decimal format for formatting
    DecimalFormat dc1 = new DecimalFormat("0.00");
    DecimalFormat dc2 = new DecimalFormat("#");

    // Init variables
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

// Do early calculations for slope, y intercept
slopeValue = (double) (changeInY) / (double) (changeInX);
yIntercept = y1 - (slopeValue * x1);

// Use equation method below to compile a simplified equation
// y = mx + b
equation = equation();

// Find distance with methods from math class
// d = √((x2 - x1)² + (y2 - y1)²)
distanceBetweenPoints = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
    }

    // To string returns the information of the LinearEquation class
    public String toString() {
        String returnedFirstPoint = "First point: (" + x1 + ", " + y1 + ")";
        String returnedSecondPoint = "\nSecond point: (" + x2 + ", " + y2 + ")";
        String returnedSlope = "\nSlope of line: " + dc1.format(slopeValue);
        String returnedYIntercept = "\nY-intercept: " + dc1.format(yIntercept);
        String returnedEquation = "\nSlope intercept form: " + equation;
        String returnedDistanceBetweenPoints = "\nDistance between points: " + dc1.format(distanceBetweenPoints);
        return returnedFirstPoint + returnedSecondPoint + returnedSlope + returnedYIntercept + returnedEquation + returnedDistanceBetweenPoints;
    }

// Solve third coordinate utilizes slope, yintercept, and a 3rd x coordinate to solve the 3rd coordinates's y value
    public String solveWithThirdCoordinate(double x) {
double thirdCoordX = x;
double thirdCoordY = (slopeValue * x) + yIntercept;
String thirdCoordPoint = "Solved coordinate point is: (" + dc1.format(thirdCoordX) + "," + dc1.format(thirdCoordY) + ")";
return thirdCoordPoint;
    }

public String niceSlope() {
	    // This method will return nice fractions
		int numerator = changeInY;
	    int denominator = changeInX;
        int gcf = 1;

        // Find gcf by checking all common factors up to the minimum value between the denominator and numnerator
        for (int i = 1; Math.min(Math.abs(denominator), Math.abs(numerator)) >= i; i++) {
            if (numerator % i == 0 && denominator % i == 0) {
                gcf = i;
            }
        }

        // Negatives for proper formatting and simplification
        if (denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }

        // Return proper x, or -x instead of 1x or -1x
        if (slopeValue == 1) {
        return "x ";
        }
        else if (slopeValue == -1){
        return "-x ";
        }

        // Return wholes, if the denominator is also a common factor
	    if (gcf == Math.abs(changeInX)) {
            return dc2.format((double) numerator / denominator) + "x ";
            }
			
	    // fractions, for all other slopes
        else {
            return dc2.format((double) numerator / gcf) + "/" + dc2.format((double) denominator / gcf) + "x ";
        }
    }

public String niceYIntercept() {
        // This method will return a nice y-intercept
        // Appends a minus sign if negative
        if (yIntercept < 0) {
            return "- " + dc1.format(Math.abs(yIntercept));
        }
        // Appends a plus sign if positive
        else {
            return "+ " + dc1.format(yIntercept);
        }
}


public String equation() {
        // Utlizes both niceSlope and niceYIntercept to create an equation to be outputted
    // many conditions for proper formatting of the eqaution
    if (slopeValue == 0 && yIntercept == 0) {
        return "y = 0";
    }
    if (slopeValue == 0) {
        return "y = " + yIntercept;
    }
    if (yIntercept == 0) {
        return "y = " + niceSlope();
    }
    else {
        return "y = " + niceSlope() + niceYIntercept();
    }
}
}
