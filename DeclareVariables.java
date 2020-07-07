/*Write a Java statement to accomplish each of the following tasks:
§ Declare variables sum and x to be of type int
§ Assign 1 to variable x.
§ Assign 0 to variable sum.
§ Add variable x to variable sum, and assign the result to variable sum
§ Print "The sum is: ", followed by the value of variable sum. */

public class DeclareVariables{

public static void main (String[] args) {

int sum,x;

sum = 0;
x=1;
sum+=x;
System.out.println("The sum is: " + sum);

}

}