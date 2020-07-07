/*Exercise 6
Write a program that displays the message Hello if a particular integer value is equal to 7, the
message Hi if a particular value is equal to 10, the message Good, if a particular value is equal to
444, the message No Match Found if none of the above conditions are matching. */





import java.util.Scanner;

public class SwitchExercise {

public static void main (String [] args) {

Scanner in = new Scanner(System.in);
System.out.println("Enter a number: ");
int number = in.nextInt();

    switch(number){  
      case 7:
      System.out.println("Hello");
      break;
      case 10:
      System.out.println("Hi");
      break;
      case 444:
      System.out.println("Good");
      break;
      default:
      System.out.println("No Match Found");
        }



}



}