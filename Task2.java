import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please, would you be so kind to write just one number: ");
		int a = sc.nextInt();
		int sum = 0;
		for(int i = 0; i <= a; i++){
			if(i % 5 == 0){
				sum += i;
			}
		}
		System.out.println(sum);
	}

}
