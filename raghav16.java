public class raghav16 {
	boolean isfibbo(int n)
	{
int a=1;
int b=1;
int c=a+b;
System.out.println(a);
System.out.println(b);

		for(int i=1;i<n-2;i++)
		{
			System.out.println(c);
			a=b;
			b=c;
			c=a+b;
System.out.println(c);


				return false;
		}
		return true;
	}
	public static void main(String[] args){
	int n=5;
	raghav16 obj=new raghav16();
	boolean ans=obj.isfibbo(n);
	System.out.println("ans= "+ans);
if(ans==true)
System.out.println(n +"fibbo");
else
System.out.println(n + "not fibbo");

			
		

}
}