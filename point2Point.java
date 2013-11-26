import java.util.Scanner;
public class point2Point
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple coordinates programme
System.out.print("This is a simple program that takes in the coordinates of 3 points and calculates which are closest");

// first initialise the Point classes
Point pointA = new Point();
Point pointB = new Point();
Point pointC = new Point();
double distanceAtoB=0;
double distanceAtoC=0;
double distanceBtoC=0;

System.out.print("\nPlease enter the first coordinates, as a string X,Y \t");
pointA.setCoordinates(scanner.nextLine());

System.out.print("\nPlease enter the second coordinates, as a string X,Y \t");
pointB.setCoordinates(scanner.nextLine());

System.out.print("\nPlease enter the third coordinates, as a string X,Y \t");
pointC.setCoordinates(scanner.nextLine());

//Calculate distance between point A and B

distanceAtoB = pointA.distanceToPoint(pointB.getXCoordinate(),pointB.getYCoordinate());
distanceAtoC = pointA.distanceToPoint(pointC.getXCoordinate(),pointC.getYCoordinate());
distanceBtoC = pointB.distanceToPoint(pointC.getXCoordinate(),pointC.getYCoordinate());

System.out.print("AtoB=" + distanceAtoB + "\n");
System.out.print("AtoC=" + distanceAtoC + "\n");
System.out.print("BtoC=" + distanceBtoC + "\n");

if (distanceAtoB<distanceAtoC) {
	if (distanceAtoB<distanceBtoC) {
		System.out.print("A and B are closest together\n");
	}
	else {
		System.out.print("B and C are closest together\n");
	}
}
else {
	if (distanceAtoC<distanceBtoC) {
		System.out.print("A and C are closest together\n");
	}
	else {
		System.out.print("B and C are closest together\n");
	}
}

	}
}

class Point
{
	double x1;
	double y1;
	
	void setCoordinates (String strCordinates) {
		// parse string and then set the X and Y coordinates ... for ease we assume the use has entered X,Y correctly
		
		String s1="";
		String s2="";
		int i=0;
		int strCoordLength = strCordinates.length();
		
		// Need to set first coordinate
		while ( (strCordinates.charAt(i) != ',') && (i<strCoordLength) ) {
			s1 = s1 + strCordinates.charAt(i);
			i++;
		}
		
		i++; // skip past the , and move onto next coordinate
		
		for (int j=i; j<strCoordLength; j++) {
			s2 = s2 + strCordinates.charAt(j);
		}
		
		x1=Double.parseDouble(s1);
		y1=Double.parseDouble(s2);
		
		System.out.print("X=" + x1 + " Y=" + y1 + "\n");
	}
	
	double getXCoordinate() {
		return x1;
	}	
	
	double getYCoordinate() {
		return y1;
	}
	
	double distanceToPoint(double x2, double y2) {
		double distance=0;
		double side1=0;
		double side2=0;
		
		// the distance between two points is essentially the length of the hypotenuse of a triangle
		side1=Math.abs(x1-x2);
		side2=Math.abs(y1-y2);
		
		distance=Math.sqrt((side1*side1) + (side2*side2));
		
		return distance;
	}
}
