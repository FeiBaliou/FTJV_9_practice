/*Write an application that stores 11 integers in an array. Display the integers from first to last, and then
display the integers from last to first
Determine and print the smallest and largest values of the array */

public class DisplayArray {

public static void main (String [] args ) {


int [] array = {1,2,7,13,21,9,33,4,14,6,44};



System.out.print("The Array has the following numbers: ");
for (int numbers:array)
{
 System.out.print(numbers + " ");
}

System.out.println("");

System.out.print("Array in reverse: ");
for(int i=array.length -1; i>=0; i--)
{ 
System.out.print(array[i] + " ");
}

System.out.println("");

int max = array[0];
for(int i=1; i<array.length;i++){ 
    if(array[i] > max){ 
    max = array[i];
} 
}
System.out.println("The largest number is : "+max + ".");

int min = array[0];
for(int i=1; i<array.length;i++){ 
    if(array[i] < min){ 
    min = array[i];
} 
}
System.out.println("The smallest number is : "+min + ".");

}
}