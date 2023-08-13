public class array{
static void max(int[] arr) {
int max=arr[0];
for(int i=0;i<arr.length;i++)
if(max<arr[i])
max=arr[i];
System.out.println(max);
}
public static void main(String [] args) {
int[] a={88,78,98,102,1};
max(a);
}
}