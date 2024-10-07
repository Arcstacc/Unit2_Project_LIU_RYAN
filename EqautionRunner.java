import java.util.Scanner;

public class EqautionRunner {
    public static void main(String[] args) {
        // Create the scanner for input
        Scanner s = new Scanner(System.in);

        // Introduction
        System.out.println("WELCOME TO THE LINEAR EQAUTION FINDER");
        System.out.println("-------------------------------------");
        System.out.println("   Please enter in '(#,#)' format");
        System.out.println("-------------------------------------");

        // Ask for coordinates
        System.out.print("Enter your first Coordinate Point: ");
        String firstPoint = s.nextLine();
        System.out.print("Enter your second Coordinate Point: ");
        String secondPoint = s.nextLine();

        // Use string methods to find strictly the numerical values without parentheses and commas
        int commaIndex1 = firstPoint.indexOf(",");
        int commaIndex2 = secondPoint.indexOf(",");
        // x value from index 1 to comma index (excluding), y value from comma index + 1 to the end (excluding parentheses)
        String x1String = firstPoint.substring(1, commaIndex1);
        int x1 = Integer.parseInt(x1String);
        String y1String = firstPoint.substring(commaIndex1 + 1, firstPoint.length() - 1);
        int y1 = Integer.parseInt(y1String);

        // Repeat for other point
        String x2String = secondPoint.substring(1, commaIndex2);
        int x2 = Integer.parseInt(x2String);
        String y2String = secondPoint.substring(commaIndex2 + 1, secondPoint.length() - 1);
        int y2 = Integer.parseInt(y2String);

        // Init the linear eqaution line object
        LinearEqaution line = new LinearEqaution(x1, y1, x2, y2);

        // Print out the current information of the line after the inputs
        String informationAboutLine = line.toString();
        System.out.println(informationAboutLine);


    // Ask for a third x value on the line
    System.out.print("Enter a third x-value: ");
    String x3String = s.nextLine();
    int x3 = Integer.parseInt(x3String);

    // Get the solved y coordinate with the third x value and print out
    String solvedThirdCoord = line.solveWithThirdCoordinate(x3);
    System.out.println(solvedThirdCoord);
    
    }
}
