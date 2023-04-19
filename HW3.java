import java.util.*;
public class hw3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Name is: " +name);
        System.out.print("Enter your last name: ");
        String last_name = in.nextLine();
        System.out.println("Last name is: " +last_name);
        System.out.print("Enter your enrollment number: ");
        String enrollment_number = in.nextLine();
        System.out.println("Enrollment number is: " +enrollment_number);
        in.close();
    }
}
