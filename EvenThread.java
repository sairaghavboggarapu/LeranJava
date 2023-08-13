import  java.lang.Thread;
class EvenThread extends Thread{
public void run(){
for(int i=0; i<=20; i++){
if((i %2)==0){
System.out.println("Thread even : " +i);
}
}
}
}
class OddThread extends Thread{
public void run(){
for(int i=0 ; i<20 ; i++){
if((i%2) != 0){
System.out.println("Thread odd : " +i);
}
}
}
}
class Main{
public static void main(String [] args){
EvenThread et = new EvenThread();
OddThread ot = new OddThread();
et.start();
ot.start();
}
}
