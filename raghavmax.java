public class raghavmax{
public static void main(String x[]) {
	int[] n=new int[]{5,88,4,444,66,99,80};
	int maxvalue=findMax(n);
	System.out.println("max value =" +maxvalue);
}
static int findMax(int a[]) {
	int max=a[0];
	for(int i=1;i<a.length;i++)
if(a[i]>max)
max=a[i];
return max;

}
static int findMin(int a[]) {
int min=a[0];
for(int i=1;i<a.length;i++)
if(a[i]<min)
min=a[i];
return min;
}
}