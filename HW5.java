import java.util.Scanner;

public class hw5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the first number: ");
        float a = scanner.nextInt();
        System.out.println("Input the second number: ");
        float b = scanner.nextInt();
        if (a>b)
            System.out.println("The greater number is: "+a);
        else
            System.out.println("The greater number is: "+b);
        System.out.println("The Aritmetic mean is: ("+a+"+"+b+")/2="+(a+b)/2);
    }
}
