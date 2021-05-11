package Methods;
class Mycla implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<10;i++) {
			System.out.println(Thread.currentThread().getId()+" Value :"+i);
		}
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
public class RunableInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Thread t1 = new Thread(new Mycla());
        Thread t2 = new Thread(new Mycla());
        t1.start();
        t2.start();
        Thread k1 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		// TODO Auto-generated method stub
        		for(int i=0;i<10;i++) {
        			System.out.println(Thread.currentThread().getId()+" Value :"+i);
        		}
        		try {
        			Thread.sleep(100);
        		} catch (InterruptedException e) {
        			// TODO Auto-generated catch block
        			e.printStackTrace();
        		}
        	}
        });
        k1.start();
        
	}

}
