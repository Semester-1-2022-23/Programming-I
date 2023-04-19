//Write a method that reverses a string.
//The method must accept one parameter of type String (string to reverse), and returns every second element from the end to the beginning.
//For example:
//String: thisisstring
//Result is: g i t s s h

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("String: ");
        String string = scanner.nextLine();
        System.out.println("result is: " +reverse(string));
        scanner.close();
    }
    public static String reverse(String string) {
        String result = "";
        for (int i = string.length()-1; i > 0 ; i-=2) {
            result += string.charAt(i)+" ";
        }
        return result;
    }
}
