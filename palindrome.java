import java.util.Scanner;
public class palindrome
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple string manipulation program

System.out.print("This program reads a string to see if it is a palindrome");
System.out.print("\nPlease enter your string\t");

String inputStr = scanner.nextLine();
int inputLength = inputStr.length();
int i;
boolean palindrome=true;

for (i=0; i<inputLength; i++) {
	if ( inputStr.charAt(i) != inputStr.charAt(inputLength - (i+1)) ) {
		System.out.print("That is not a palindrome, no sir");
		palindrome=false;
		break;
	}
}

if (palindrome) {
	System.out.print("What a cool palindrome sunshine");
}
	}
}

