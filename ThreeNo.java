import java.util.Scanner;
public class ThreeNo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the a");
		int a=sc.nextInt();
		System.out.println("Enter the b");
		int b=sc.nextInt();
		System.out.println("Enter the c");
		int c=sc.nextInt();
		
		if(a>b && b>c) {
			System.out.println(a);
		}
		else if(b>a && b>c) {
			System.out.println(b);
		}
		
		else {
			System.out.println(c);
		}

	}

}
