//Write a program that asks the user to input 10 numbers. The program must output square substract of last and first, last-1 and 2nd ...
//Example:
//Given numbers are: 1 3 4 5 6 9 10 12 0 11
//Result is: 100 9 64 25 9
//More explanation:
//100 = (11 -1)^2
//9=(0-3)^2
//64=(12-4)^2
//25=(10-5)^2
//9=(9-6)^2

import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Given numbers are: ");
        for (int i = 0; i < 10; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.println("Result is:");
        for (int i = 0; i < 5; i++) {
            System.out.print((int) Math.pow(array[i] - array[9-i],2)+" ");
        }
        scanner.close();
    }

}
