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
int changeInX = x2 - x1;
int changeInY = y2 - y1;

slopeValue = (double) (changeInY) / (double) (changeInX);
slopeString = (changeInY) + "/" + (changeInX);
yIntercept = y1 - (slopeValue * x1);

// y = mx + b
equation = "y = " + slopeString + " + " + yIntercept;
    
// Find distance with methods from math class
distanceBetweenPoints = Math.sqrt(Math.pow(changeInX, 2) + Math.pow(changeInY, 2));
    }
// Fix this later
    public String toString() {
        System.out.println("First point: (" + x1 + ", " + y1 + ")");
        System.out.println("Second point: (" + x2 + ", " + y2 + ")");
        System.out.println("Slope of line: " + dc1.format(slopeValue));
        System.out.println("Y-intercept: " + dc1.format(yIntercept));
        System.out.println("Slope intercept form: " + equation);
        System.out.println("Distance between points: " + distanceBetweenPoints);
    }

    public String solveWithThirdCoordinate(int x) {
double thirdCoordX = x;
double thirdCoordY = (slopeValue * x) + yIntercept;
String thirdCoordPoint = "(" + thirdCoordX + "," + thirdCoordY + ")";
return thirdCoordPoint;
    }
}
