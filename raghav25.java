public class raghav25{
static int sumOfDigits(int n) {
int sum=0,r;
int a=12377;
while(a>0)
{
r=a%10;
System.out.println("r="+r);  //to get remainder after modulos divison
		a=a/10;
		System.out.println("a="+a);  //to get ans after division

sum=sum+r;
}
return sum;
}
public static void main(String[] args) {
int ans=sumOfDigits(12377);
System.out.println("ans ="+ans);
}
}