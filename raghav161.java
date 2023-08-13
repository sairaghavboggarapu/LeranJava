public class raghav16 {
	int findreverse(int n) {
		int ans=0;
		while(n!=0) {
			int r=n%10;
			n=n/10;
			ans=ans*10+r;
		}
		return ans;
		}
	
public static void main(String[] args) {
	int n=188;
	raghav16 obj=new raghav16();
	int ans=obj.findreverse(n);
	System.out.println(ans);}}