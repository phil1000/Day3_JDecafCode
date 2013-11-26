import java.util.Scanner;
public class calculator
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple calculator program

System.out.print("This is a simple program that takes in two numbers and then allows you to choose a calculation");
System.out.print("\nPlease enter the first number, an Integer please \t");
int num1 = scanner.nextInt();

System.out.print("\nPlease enter the second number, an Integer please \t");
int num2 = scanner.nextInt();

System.out.print("\nNow enter your required calculation");
System.out.print("\nFor Addition Type 1\t");
System.out.print("\nFor Subtraction Type 2\t");
System.out.print("\nFor Multiplication Type 3\t");
System.out.print("\nFor Division Type 4\t");

int calcChoice = scanner.nextInt();
String strCalcChoice = "";

int output = 0;

switch (calcChoice)
{ 
	case 1:
		output = num1+num2;
		strCalcChoice = "Addition";
		break;
	case 2:
		output = num1-num2;
		strCalcChoice = "Subtraction";
		break;
	case 3:
		output = num1*num2;
		strCalcChoice = "Multiplication";
		break;
	case 4:
		output = num1/num2;
		strCalcChoice = "Division";
		break;
	default:
		output = 0;
		break;
}

System.out.print("\nThe first number was: " + num1 + " and second number was: " + num2);
System.out.print("\nThe calculation chosen was " + strCalcChoice);
System.out.print("\nThe result is " + output);
	}
}

