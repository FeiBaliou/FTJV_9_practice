/*Exercise 7
Write code to print the numbers between 1 and 100 that are evenly divisible by four but not by five. */

public class DivisibleBy4NotBy5 {

public static void main (String [] args){

int x = 0;

for(x = 1; x<101; x++) { 
  if( (x%4 == 0) && (x%5 !=0) ){
  System.out.print(x + " ");
}
}


}
}