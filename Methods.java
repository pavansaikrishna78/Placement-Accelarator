package Methods;

public class Methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        myfirstmethod();
        say("John");
        int a=add(1,2,3);
        a=a*5;
        System.out.println(a);
	}
    public static void myfirstmethod() {
    	System.out.println("Hello World");
    	}
    public static void say (String name) {
    	System.out.println("Hello Youtube"+name);
    }
    public static void add(int a,int b) {
    	System.out.println(a+b);
    }
    public static int add(int a,int b,int c) {
    //	System.out.println(a+b+c);
    	return a+b+c;
    }
   
}
