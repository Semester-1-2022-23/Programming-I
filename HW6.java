import java.util.Scanner;

public class hw6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert n:");
        int n = scanner.nextInt();
        System.out.println("Insert k:");
        int k = scanner.nextInt();
        int binominal=(fact(n))/(fact(k)*fact(n-k));
        if (n>=k && k>=0){
            System.out.println("Result:"+binominal);
        }
        else{
            System.out.println("Criteria doesn't match.");
        }
        System.out.println("Coefficient-array:");
        for (int i=0; i<=k; i++) {
            System.out.print((fact(n))/(fact(i)*fact(n-i))+" ");
        }
        System.out.println();
        for (int i=0; i <n; i++) {
            for (int j=0; j<=i; j++) {
                System.out.print(" "+fact(i)/(fact(i-j)*fact(j)));
            }
            System.out.println();
        }
    }
    public static int fact(int a){
        if (a == 0){
            return 1;
        }
        else {
            return a*fact(a-1);
        }

    }
}
