import java.text.DecimalFormat;

public class LinearEqaution {
    // Create a bunch of variables
    // Decimal format for formatting
    DecimalFormat dc1 = new DecimalFormat("#.00");
    private int x1; // First x coordinate
    private int x2; // Second x coordinate
    private int y1; // First y coordinate
    private int y2; // Second y coordinate
    private double slopeValue; // Slope
    private double slopeString; // For eqaution
    private double yIntercept; // y-intercept
    private String equation; // string of equation 
    private double distanceBetweenPoints; // distance

    
	public LinearEqaution(int x1, int y1, int x2, int y2) {
this.x1 = x1;
this.y1 = y1;
this.x2 = x2;
this.y2 = y2;
    }
}
