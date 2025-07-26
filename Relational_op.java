package CSE;
import java.util.Scanner;
public class Relational_op {
	  public static void main(String[] args) {
		  int a,b;
		  Scanner sc= new Scanner(System.in);
		  a=sc.nextInt();
		  b=sc.nextInt();
		  System.out.println("a is " + a + " and b is " + b);
		  System.out.println(a == b);  // false
		  System.out.println(a != b);  // true
		  System.out.println(a > b);  // false
		  System.out.println(a < b);  // true
		  System.out.println(a >= b);  // false
		  System.out.println(a <= b);  // true
		}
	}



