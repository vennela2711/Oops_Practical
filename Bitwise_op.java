package CSE;
import java.util.Scanner;
public class Bitwise_op {
	   public static void main(String args[]) {
		     int a,b,c;
		     Scanner sc= new Scanner(System.in);
		     a=sc.nextInt();
		     b=sc.nextInt();
		     c=sc.nextInt();
		      c = a & b;       
		      System.out.println("a & b = " + c );
		      c = a | b;       
		      System.out.println("a | b = " + c );
		   }
		}



