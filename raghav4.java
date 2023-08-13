import java.util.scanner;
public class raghav4 {
public static void main (String[] args) {
	System.out.println("enter a char");
      Scanner s=new Scanner(System.in);
      char c=s.next().charAt(0);
	if(Character.isLowerCase(c))
		System.out.println("upper case ");
	else
		System.out.println("lower case");
}
}