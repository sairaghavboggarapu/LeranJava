public class raghav24{
	static int[] addArray(int a[],int b[])
	{
	int c[]=new int[a.length];
	for(int i=0;i<a.length;i++) 
	c[i]=a[i] + b[i];
	      
	return c;
	}
	
	public static void main(String[] args) {
	int a[]={77,-1,-2,-3,4,5};
	int b[]={77,-1,-2,-3,4,5};
	int ans[]=addArray(a,b);
for(int i=0; i<ans.length;i++)
	System.out.println("ans="+ans[i]);
	}
	}
