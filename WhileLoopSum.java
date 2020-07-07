/*Write a Java application that calculates and prints the sum of the integers from 1 to 10. Use a while
statement to loop through the calculation and increment statements. The loop should terminate
when the value of x becomes 11. */


public class WhileLoopSum {

public static void main(String [] args) {

int x = 0;
int sum = 0;

while (x<11) {
sum+=x;
x++;
}

System.out.println("The sum of the integers from 1 to 10 is: " + sum + ".");

}
}