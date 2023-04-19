import java.util.Scanner;

public class hw4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name:");
        String firstName = scanner.nextLine();
        System.out.println("Last name:");
        String lastName = scanner.nextLine();

        char[] arr1=new char[firstName.length()];
        for(int i=0; i<arr1.length; i++){
            arr1[i]=firstName.charAt(i);

            for(int j=0; j<arr1.length; j++){
                if(i==j)
                    System.out.print(arr1[i]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        char[] arr2=new char[lastName.length()];
        System.out.println();

        for (int i=0; i<arr2.length; i++){
            arr2[i]=lastName.charAt(i);
            for(int j=0; j<arr2.length; j++){
                if(i==j)
                    System.out.print(arr2[i]);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

    }
}
