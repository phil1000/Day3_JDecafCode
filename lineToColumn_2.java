import java.util.Scanner;
public class lineToColumn_2
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple string manipulation program

System.out.print("This program reads a number of words separated by a space from a user and outputs each word on its own line");
System.out.print("\nPlease enter the string please and please terminate the string with a space\t");

String inputStr = scanner.nextLine();
int inputLength = inputStr.length();
int eCount=0;
int i;
String outputStr="";

for (i=0; i<inputLength; i++) {
	
	if (inputStr.charAt(i) != ' ') {
		outputStr=outputStr + inputStr.charAt(i);
	}
	else {
		System.out.print(outputStr + "\n");
		outputStr="";
	}
}
	}
}

