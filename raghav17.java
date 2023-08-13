public class raghav17 {
String findreverse(String x) {
	String ans="";
	for(int i=x.length()-1;i>=0;i--)
	{
		char c=x.charAt(i);
		ans=ans+c;		
	}
	return ans;
	}
public static void main(String[] args) {
	raghav17 obj=new raghav17();
	String ans=obj.findreverse("raghav");
	System.out.println(ans);
	

}

}
