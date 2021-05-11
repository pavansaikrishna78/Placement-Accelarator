package Methods;
import java.util.ArrayList;
import java.nio.channels.AlreadyBoundException;
import java.util.*;
import java.util.Date;
import java.text.*;
public class Myvlass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     /*   Student a = new Student();
        System.out.println(a.noofstudents());
        System.out.println(a.noofstudents());
        a.setId(1);
        System.out.println(a.getId());
        a.setName("Mark");
        System.out.println(a.getName());
        a.setAge(15);
        System.out.println(a.getAge());
        Cube cd = new Cube(20,20,20);
        System.out.println(cd.getCube());
        System.out.println(Add(1,2));
        System.out.println(Add(2.0,3.0));
        Hello ka = new Hello(5);
        System.out.println(ka.d);
        System.out.println(ka.Dosomething("Bold"));
        System.out.println(Hello.Dosomething("Kite"));
        System.out.println(ka.Dosomethingelse("Rabada"));
        Polygon b = new Rectangle();
        Rectangle rec =  new Rectangle();
    	Triangle tri = new Triangle();
    	rec.set(2,5);
    	System.out.println(rec.area());
    	Bank ba = new Bank_ABC();
    	System.out.println(ba.getIntrestRate());
    	ArrayList<Integer> aa = new ArrayList<>(5);
    	aa.add(1);
    	aa.add(2);
    	for(Integer x: aa) {
    		System.out.println(x);
    	}
    	LinkedList<String>bb = new LinkedList<String>();
    	bb.add("patrik");
    	bb.add("mark");
    	bb.addFirst("tom");
    	bb.addLast("john");
    	for(String x: bb) {
    		System.out.println(x);
    	}
    	try {
    	int bod = 100/0;
    	}catch(ArithmeticException e) {
    		System.out.println(e);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println(e);
    	}
    	int papa[]= new int[2];
    	try {
    		//System.out.println("Value is:"+papa[3]);
    		System.exit(1);
    	}catch(ArithmeticException e) {
    		System.out.println(e);
    	}catch(ArrayIndexOutOfBoundsException e) {
    		System.out.println(e);
    	}finally {
    		System.out.println("finally called");
    	}*/
    	System.out.println(retInt());
    	Date date = new Date();
    	SimpleDateFormat  k = new SimpleDateFormat("E yyyy/MM/dd HH:");
    	System.out.println(date.toString());
    	System.out.println(date.getTime());
    	System.out.println(date.getMonth());
    	System.out.println(k.format(date));
    	
	}
	@SuppressWarnings("finally")
	public static int retInt() {
		int a=100;
		try {
    		//System.out.println("Value is:"+papa[3]);
    		return a;
    	}catch(ArithmeticException e) {
    		System.out.println(e);
    		return a;
    	}finally {
    		a=5000;
    		System.out.println("finally called");
    		return a;
    	}
	}
	public static int Add(int a,int b) {
		return a+b;
	}
	public static double Add(double a,double b) {
		return a+b;
	}
	
}
