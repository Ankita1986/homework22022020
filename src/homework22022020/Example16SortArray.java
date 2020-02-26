package homework22022020;
  //Write a Java program to sort a numeric array and a string array
import java.util.Arrays;

public class Example16SortArray {
   //  Main method declaration
   public static void main(String[] args) {
       int[] my_array1 ={20, 50, 60, 90, 40,30};
       String[] my_array2 = {"Prime","Testing","Manual","Automation","Interview"};
       System.out.println("Original numeric array : "+ Arrays.toString(my_array1));
       Arrays.sort(my_array1);
       System.out.println("Sorted numeric array :"+ Arrays.toString(my_array1));

       System.out.println("Original string array :"+ Arrays.toString(my_array2));
       Arrays.sort(my_array2);
       System.out.println("Sorted string array :"+ Arrays.toString(my_array2));
   }



















}
