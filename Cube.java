package Methods;

public class Cube {
       int length;
       int height;
       int breadth;
       public int getCube() {
    	   return length*breadth*height;
       }
       Cube(){
    	   length=10;
    	   breadth=20;
    	   height=30;
       }
       Cube(int a,int b,int c){
    	   length=a;
    	   breadth=b;
    	   height=c;
       }
}
