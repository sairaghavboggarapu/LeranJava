import java.util.*;
import java.lang.Thread;
class FirstMax extends Thread{
private int ans;
private int[] arr;
public FirstMax(int[] arr){
this.arr= arr;
}
public void run(){
for(int i=0;i<arr.length;i++){
if(arr[i]==100){
ans++;
}
}
}
public int getAns(){
return ans;
}
}
class SecondMax extends Thread{
private int ans=0;
private int[] arr;
public SecondMax(int[] arr){
this.arr = arr;
}
public void run(){
for(int i=0;i<arr.length;i++){
if(arr[i]==100){
ans++;
}
}
}
public int getAns(){
return ans;
}
}
class Main{
public static void Main(String[] args){
Scanner sc = new Scanner(System.in);
int n= sc.nextInt();
sc.nextLine();
int firstarr[] = new int[n/2];
int secondarr[] = new int[n/2];
int k=0;
for(int i=0; i<n ;i++){
if(i < n/2){
firstarr[i] =sc.nextInt();
}
else{
secondarr[i]=sc.nextInt();
}
}
sc.close();
FirstMax fm = new FirstMax(firstarr);
SecondMax sm = new SecondMax(secondarr);
try{
fm.join();
sm.join();
}
catch(InterruptedException e){
System.out.println();
}
System.out.println("Winners : "+(fm.getAns() +sm.getAns()));
}
}