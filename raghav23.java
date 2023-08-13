public class raghav23 {
	static int[] addArray(int a[],int b[],int c[])
	{
	int d[]=new int[a.length];
for(int i=0;i<a.length;i++) 
	d[i] = a[i] + b[i] +c[i];
	      
	return d;
	
	}
	public static void main(String[] args) {
	int a[]={11,12,13};
	int b[]={-11,-12,-13};
      int c[]={0,0,0};
	int ans[]=addArray(a,b,c);
	for(int i=0; i<ans.length;i++)
	System.out.println("ans="+ans[i]);
	}
	}