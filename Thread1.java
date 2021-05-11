package Methods;
class Myclass extends Thread{
	public void run() {
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
public class Thread1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Myclass a = new Myclass();
        a.start();
        Myclass a1 = new Myclass();
        a1.start();
	}

}
