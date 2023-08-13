public class raghav9 {
public static void main(String[] args) {
   int	a=1;
int b=1;
	int c=a+b;
	int n=6;
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