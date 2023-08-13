import java.util.Scanner;
public class raghav{

static int[] findSum(int input[]){
	int ans[]= new int[input.length];

for(int j=0;j<ans.length;j++)
{
	ans[j]=input[j]+input[ans.length-j-1];
}
for(int k=0;k<ans.length;k++)
{
	System.out.println(ans[k]+" ");
}
return ans;
}


public static void main(String[] args) {
	int Data[] = { 11,22,33,44};
	int answer[] = findSum(Data);
	

}


}
