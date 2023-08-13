public class raghav22 {
	public static void main(String[] args) {
		triangle1 n=new triangle1();
		n.b=12;
		n.h=15;
		triangle1 n1=new triangle1();
		n1.b=25;
		n1.h=12;
		System.out.println("area of" +n+ "is" +n.area());
		System.out.println("area of" +n1 +"is" +n1.area());
	}

}
class triangle1{
	int h,b;
	double area() {
		return 0.5*b*h;
	}
	
	@Override
	public String toString() {
		return "triangle1{"+
	"h="+h +
	"b="+b;
		
	}
}
