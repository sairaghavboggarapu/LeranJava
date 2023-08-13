public class raghav18{
String toggle(String x) {
	String ans="";
	char all[]=x.toCharArray();
	for(int i=0;i<x.length();i++)
	{
		char c=all[i];
		if(Character.isLowerCase(c))
ans += Character.toUpperCase(c);
else
ans += Character.toLowerCase(c);	
	}
	return ans;
	}
public static void main(String[] args) {
	raghav18 obj=new raghav18();
	String ans=obj.toggle("SAIraghav");
	System.out.println(ans);
	

}

}
