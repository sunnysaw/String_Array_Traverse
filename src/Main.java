/*
Question : Convert the list of Strings {“ab”, “bc”, “cd”, “de”, “ef”, “fg”, “gh”} into an array of strings and print all
strings stored on odd indices of the array.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of array :");
        int sizeOfArray = input.nextInt();
        System.out.println("Enter the element inside array :");
        String[] array = new String[sizeOfArray];
        for (int start = 0; start < array.length; start++){
            array[start] = input.next();
        }
        System.out.println("Printing the result :");
        for (int start = 0; start < array.length; start++){
            if (start % 2 != 0){
                System.out.println(array[start]);
            }
        }
    }
}