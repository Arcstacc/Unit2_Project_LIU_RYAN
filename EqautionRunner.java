import java.util.Scanner;

public class EqautionRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO THE LINEAR EQAUTION FINDER (I know its creativtly bankrupt)");
        
        System.out.println("Enter your first Coordinate Point: ");
        String firstPoint = s.nextLine();
        System.out.println("Enter your second Coordinate Point: ");
        String secondPoint = s.nextLine();

        int commaIndex1 = firstPoint.indexOf(",");
        int commaIndex2 = secondPoint.indexOf(",");

        String x1String = firstPoint.substring(0, commaIndex1);
        int x1 = Integer.parseInt(x1String);
        String y1String = firstPoint.substring(commaIndex1 + 1, firstPoint.length() - 1);
        int y1 = Integer.parseInt(y1String);

        String x2String = secondPoint.substring(0, commaIndex2);
        int x2 = Integer.parseInt(x2String);
        String y2String = secondPoint.substring(commaIndex2 + 1, secondPoint.length() - 1);
        int y2 = Integer.parseInt(y2String);

        LinearEqaution line = new LinearEqaution(x1, y1, x2, y2)
	// Step 6: Construct linear equation object with the information on coordinates
	// Step 7: Call toString() to output information
	// Step 8: Ask for a third x-value to solve on the linear equation
	// Step 9: print out the solution by calling solveWithThirdCoordinate(x) with the third x value to get the return value
	// Step 10: We done :D
    }
}
