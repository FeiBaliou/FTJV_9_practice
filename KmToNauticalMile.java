/* Write a Java class that declares named constants to represent the number of kilometers (1.852) and
the number of miles (1.150779) in a nautical mile.
Also declare a variable to represent a number of nautical miles and assign a value to it.
Compute and display, with explanatory text, the value in kilometers and in miles */


import java.util.Scanner;

public class KmToNauticalMile {

public static void kmToNmi(Scanner in, Float kmInput, Float formulaKmToNmi){
float nautilusMiles = (kmInput / formulaKmToNmi);
System.out.println( kmInput + "km are " + nautilusMiles + " nautical miles.");

}

public static void mileToNmi(Scanner in, Float milesInput, Float formulaMileToNmi) {
float nautilusMiles = (milesInput / formulaMileToNmi);
System.out.println(milesInput  + " miles are " + nautilusMiles + " nautical miles.") ;
}

public static void nmiToKmMiles(Scanner in, Float nmi, Float formulaMileToNmi, Float formulaKmToNmi) {
float km = (nmi * formulaKmToNmi);
float mile = (nmi * formulaMileToNmi);
System.out.println(nmi  + " nautical miles are " + km + " km and " + mile + " miles.") ;
}

public static void main (String [] args) {

Scanner in = new Scanner(System.in);

float formulaKmToNmi = 1.852f;
float formulaMileToNmi = 1.150779f;

System.out.println("Enter km : " );
float kmInput = in.nextFloat();
kmToNmi(in,kmInput,formulaKmToNmi);

System.out.println("Enter miles : ");
float milesInput = in.nextFloat();
mileToNmi(in,milesInput,formulaMileToNmi);


System.out.println("Enter nautical miles: ");
float nmi = in.nextFloat();
nmiToKmMiles(in,nmi,formulaMileToNmi,formulaKmToNmi);

}

}