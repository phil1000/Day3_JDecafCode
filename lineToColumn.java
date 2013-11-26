import java.util.Scanner;
public class lineToColumn
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple string manipulation program

System.out.print("This program reads text from a user and outputs their input but one character on a line at a time");
System.out.print("\nPlease enter the string please \t");

String inputStr = scanner.nextLine();
int inputLength = inputStr.length();
int eCount=0;
int i;

for (i=0; i<inputLength; i++) {
	// n.b. only use one apostrophe for characters - a string assumes a string end character
	System.out.print(inputStr.charAt(i) + "\n");
}
	}
}

