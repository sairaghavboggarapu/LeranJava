import java.util.*;
import java.lang.Thread;

class HallBooking implements Runnable{
private String hallName;
private Double cost;
private Integer hallCapacity;
private Integer seatsBooked;
public HallBooking(String hallName, Double cost,Integer halCapacity,Integer seatsBooked){
this.hallName= hallName;
this.cost= cost;
this.hallCapacity = hallCapacity;
this.seatsBooked =seatsBooked;
}

public void run() {

if(seatsBooked *100 > cost) {

System.out.println("profit");
 }
else{

System.out.println("loss");

}
}

}



class Main{
 public static void main(String[] args) {

Scanner sc =new Scanner(System.in);

int n= sc.nextInt();
 sc.nextLine();

for (int i=0; i < n; i++) {

String hallName= sc.nextLine();
 Double cost= Double.parseDouble(sc.nextLine()); 
Integer hallCapacity= Integer.parseInt(sc.nextLine());
Integer seatsBooked =Integer.parseInt(sc.nextLine());
HallBooking hb = new HallBooking(hallName, cost, hallCapacity, seatsBooked);
Thread th1= new Thread(hb);
th1.start();
}
sc.close();
}
}
