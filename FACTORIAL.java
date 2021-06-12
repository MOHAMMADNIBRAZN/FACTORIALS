package FACTORIAL;
import java.util.Scanner;
public class FACTORIAL {

	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("enter the number:");
			int num=scanner.nextInt();
			int factorial = fact(num);
			System.out.println("factorial of entered number is:"+factorial);
		}
	}
static int fact(int n)
{
	int output;
	if(n==1) {
		return 1;
	}
	output = fact(n-1)*n;
	return output;
}
}
