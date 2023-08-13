// vector is  a one-dimensional array
//[-2 -5 6 -2 -3 1 5 -6]
// how?  ;it goes through the array only once
//gives startIndex and endIndex of the answer
//runtime O(n) 
//vector is infinite size 1D array in java ; get(i);size()
//note : in vector, we never face AIOOBE
import java.util.*;
public class raghav28{
public static void main(String[] argss) {
Vector<Integer>arr=null;
arr=new Vector<Integer>();
arr.add(1);arr.add(-2);
arr.add(-3);arr.add(-4);
arr.add(-4);arr.add(-4);arr.add(-4);
System.out.println(arr.size());
}
}