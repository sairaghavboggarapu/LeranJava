public class raghav21 {
public static void main(String[] args) {
	triangle n=new triangle();
	n.a=12;
	n.b=15;
	System.out.println("area of n is "+n.area());
     triangle n1=new triangle();
	n1.a=112;
	n1.b=115;
	System.out.println("area of n1 is "+n1.area());
}
}
class triangle{
	int a,b;
	long area() {
		return (long)(0.5*a*b);
		
	}
}
