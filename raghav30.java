public class raghav30{
public static void main(String[] args) {
static int findMaxSub_0_N(int[] a) {
int sum=0;
int max =IntegerMIN_VALUE;
for(int k:a) {
sum +=k;
max=Math.max(sum,max);
System.out.println("sum="+sum);
System.Out.Println("max="+max);
if(sum<0)
 sum=0;
}
return max;
}}