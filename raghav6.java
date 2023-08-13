import java.util.Scanner;

public class raghav6 {
public static void main(String[] args) {
	
			System.out.println("enter a char");
		      Scanner s=new Scanner(System.in);
		      char c=s.next().charAt(0);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
			System.out.println("it is vowel ");
			else
				System.out.println("not vowel");
		
}
}
