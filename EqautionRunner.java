import java.util.Scanner;

public class EqautionRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("WELCOME TO THE LINEAR EQAUTION FINDER");
        
        System.out.print("Enter your first Coordinate Point: ");
        String firstPoint = s.nextLine();
        System.out.print("Enter your second Coordinate Point: ");
        String secondPoint = s.nextLine();

        int commaIndex1 = firstPoint.indexOf(",");
        int commaIndex2 = secondPoint.indexOf(",");

        String x1String = firstPoint.substring(1, commaIndex1);
        int x1 = Integer.parseInt(x1String);
        String y1String = firstPoint.substring(commaIndex1 + 1, firstPoint.length() - 1);
        int y1 = Integer.parseInt(y1String);

        String x2String = secondPoint.substring(1, commaIndex2);
        int x2 = Integer.parseInt(x2String);
        String y2String = secondPoint.substring(commaIndex2 + 1, secondPoint.length() - 1);
        int y2 = Integer.parseInt(y2String);

        LinearEqaution line = new LinearEqaution(x1, y1, x2, y2);
        String informationAboutLine = line.toString();
        System.out.println(informationAboutLine);
        // Ask if toString is sout or return value?

    System.out.print("Enter a third x-value: ");
    String x3String = s.nextLine();
    int x3 = Integer.parseInt(x3String);
    String solvedThirdCoord = line.solveWithThirdCoordinate(x3);
    System.out.println(solvedThirdCoord);
    
    }
}
