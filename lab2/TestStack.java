import java.util.*;
public class TestStack {
	
	
	public static void main (String[] args) {

		//Excercise 1
		
		MyStack <Fraction> stack = new MyStack <Fraction>();  // Java API
		Scanner sc =new Scanner(System.in);
		int a,b;
		Fraction f;
		System.out.println("Nhap so luong Phan so: ");
		int n = sc.nextInt();
		
		for (int i=0;i<n;i++)
		{
			a = sc.nextInt();
			b = sc.nextInt();
			stack.push(new Fraction(a,b));
		}
		stack.print();
		
		sc.close();

	}
}