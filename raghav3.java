import java.util.Scanner;
public class raghav3 {
public static void main (String[] args) {
	System.out.println("enter a number");
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
	if(n%100==0)
		System.out.println("multiple of 100 ");
	else
		System.out.println("not multiple of 100");
}
}
