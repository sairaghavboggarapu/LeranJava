public class raghav9 {
public static void main(String[] args) {
   long a=1;
long b=1;
	long c=a+b;
	int n=100;
	System.out.println(a);
	System.out.println(b);
	
	for(int i=1;i<n-2;i++) 
	{
		System.out.println(c);
		a=b;
		b=c;
		c=a+b;
		
	}
}
}