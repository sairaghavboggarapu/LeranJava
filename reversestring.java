public class reversestring{
 static void main(String[] args){
public static String reverseString(String x)
{
char c[]=x.toCharArray();
String rev="";
for(int i=c.length-1;i>=0;i--)
{
rev +=c[i];
}
return rev;
}}