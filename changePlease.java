import java.util.Scanner;
public class changePlease
{
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
// Simple purchase/checkout calculator
// First setup a new class

checkOut checkClass = new checkOut();

System.out.print("This is a simple program that works out the cost of a purchase, the money given and change due");
System.out.print("The change is split into note types");
System.out.print("\nPlease enter the purchase price \t");

checkClass.purchasePrice = scanner.nextDouble();

System.out.print("\nPlease enter the amount paid \t");;
checkClass.paidAmount = scanner.nextDouble();

// Now we call the cCalculate class to do our calculations

checkClass.calculateAnswer();

System.out.print("\nThe change due is " + checkClass.changeGiven);
System.out.print("\nThis will be given as " + checkClass.changeNotes + " notes and " + checkClass.changePence + " pence");
System.out.print("\nThis will be given as " + checkClass.strNotes + " and " + checkClass.strPence);

	}
}

class checkOut {
	public double purchasePrice;
	public double paidAmount;
	public double changeGiven;
	public double changeNotes;
	public double changeNotesRemainder;
	public double changePence;
	public String strNotes="";
	public String strPence="";
	
	public void calculateAnswer () {
		changeGiven = paidAmount - purchasePrice;
		changeNotes = Math.floor(changeGiven);
		//now split out note types - 20, 10 or 5
		if (changeNotes>20) {
			strNotes = (int) Math.floor(changeNotes/20) + " twenty pound notes ";
			changeNotesRemainder = changeNotes - 20*Math.floor(changeNotes/20);
		}
		if (changeNotesRemainder>10) {
			strNotes = strNotes + (int) Math.floor(changeNotesRemainder/10) + " ten pound notes ";
			changeNotesRemainder = changeNotesRemainder - 10*Math.floor(changeNotesRemainder/10);
		} 
		if (changeNotesRemainder>5) {
			strNotes = strNotes + (int) Math.floor(changeNotesRemainder/5) + " five pound notes ";
			changeNotesRemainder = changeNotesRemainder - 5*Math.floor(changeNotesRemainder/5);
		} 
		if (changeNotesRemainder>1) {
			strNotes = strNotes + (int) Math.floor(changeNotesRemainder/1) + " one pound coins ";
			changeNotesRemainder = changeNotesRemainder - Math.floor(changeNotesRemainder/1);
		} 
		
		changePence = 100*(changeGiven - changeNotes);
		// now split out pence types ... NOT !!!!
		strPence = "do something similar for the pence";
	}
}
