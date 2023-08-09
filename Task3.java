import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Number of elements: ");
		int a = sc.nextInt();
		int array[] = new int[a];
		for(int i = 0; i < a; i++){
			array[i] = sc.nextInt();
		}
		for(int i = 0; i < a; i++){
			if(array[i] % 2 == 0) System.out.print(array[i] + ", ");
		}
		int counter = 0;
		for(int i = 0; i < a; i++){
			if(array[i] < 0) counter++;
		}
		System.out.println("Negative: " + counter);
		
		
		int product = 1;
		for(int i = 0; i < a; i++){
			if(i % 2 != 0) product *= array[i];
		}
		System.out.println("Product: " + product);
	}

}
