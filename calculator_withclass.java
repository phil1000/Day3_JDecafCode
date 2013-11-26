import java.util.Scanner;
public class calculator_withclass
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple calculator program
// First setup a new class

cCalculate calcClass = new cCalculate();

System.out.print("This is a simple program that takes in two numbers and then allows you to choose a calculation");
System.out.print("\nPlease enter the first number, an Integer please \t");
calcClass.cNum1 = scanner.nextInt();

System.out.print("\nPlease enter the second number, an Integer please \t");
calcClass.cNum2 = scanner.nextInt();

System.out.print("\nNow enter your required calculation");
System.out.print("\nFor Addition Type 1\t");
System.out.print("\nFor Subtraction Type 2\t");
System.out.print("\nFor Multiplication Type 3\t");
System.out.print("\nFor Division Type 4\t");

calcClass.calcChoice = scanner.nextInt();

// Now we call the cCalculate class to do our calculations

calcClass.calculateAnswer();

System.out.print("\nThe first number was: " + calcClass.cNum2 + " and second number was: " + calcClass.cNum2);
System.out.print("\nThe calculation chosen was " + calcClass.strCalcChoice);
System.out.print("\nThe result is " + calcClass.output);

	}
}

class cCalculate {
	public int calcChoice;
	public int cNum1;
	public int cNum2;
	public String strCalcChoice = "";
	public int output = 0;
	
	public void calculateAnswer () {

		switch (calcChoice)
		{ 
			case 1:
				output = cNum1+cNum2;
				strCalcChoice = "Addition";
				break;
			case 2:
				output = cNum1-cNum2;
				strCalcChoice = "Subtraction";
				break;
			case 3:
				output = cNum1*cNum2;
				strCalcChoice = "Multiplication";
				break;
			case 4:
				output = cNum1/cNum2;
				strCalcChoice = "Division";
				break;
			default:
				output = 0;
				break;
		}
	}
}
