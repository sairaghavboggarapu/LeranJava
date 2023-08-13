public class raghav15 {
		boolean isprime(int n)
		{
			for(int i=2;i<n;i++)
			{
				if(n%i==0)
					return false;
			}
			return true;
		}
		public static void main(String[] args){
		int n=100;
		raghav15 obj=new raghav15();
		boolean ans=obj.isprime(n);
		System.out.println("ans= "+ans);
if(ans==true)
System.out.println(n +"prime");
else
System.out.println(n + "not prime");
}}