import java.util.Scanner;

public class Program__04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number between 0 to 1000 : ");
		int no=sc.nextInt();	
		int n1=no%10;
		no=no/10;
		int n2=no%10;
		no=no/10;
		int n3=no%10;
		int sum=n1+n2+n3;
		
		System.out.println("Sum is :"+sum);
		
	}

}
