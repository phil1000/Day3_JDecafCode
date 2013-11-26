import java.util.Scanner;
public class palindromeCreator
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple string manipulation program

System.out.print("This program reads a string and then prints out a palindrome");
System.out.print("\nPlease enter your string ... pronto\t");

String inputStr = scanner.nextLine();
String outputStr = inputStr;
int inputLength = inputStr.length();
int i;

for (i=0; i<inputLength; i++) {
	outputStr = outputStr + inputStr.charAt(inputLength - (i+1));
}

System.out.print(outputStr);
System.out.print("** end of string **");
	}
}

