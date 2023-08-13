public class matrixadd{
public static void main(String[] args) {
//3,6,9
//6,12,18
//9,18,27

int a[][]={{1,1,1},{2,2,2},{3,3,3}};
int b[][]={{1,1,1},{2,2,2},{3,3,3}};

int sum=0;
for(int i=0;i<3;i++){
for(int j=0;j<3;j++){
sum+=a[i][j];
}
System.out.print("sum="+sum);
}
System.out.println();   //only for sym
}
}