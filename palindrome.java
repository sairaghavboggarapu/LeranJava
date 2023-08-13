public class palindrome{
public static void main(String[] args) {
int rem,temp;
int sum=0;
int n=545;
temp=n;
while(n>0){
rem=n%10;
sum=sum*10+rem;
n=n/10;
}
if(temp==sum)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
