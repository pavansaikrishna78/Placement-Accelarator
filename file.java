package Methods;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class file {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		try {
        File file = new File("fileName.txt");
        if(!file.exists()) {	
					file.createNewFile();
				}
				PrintWriter pw = new PrintWriter(file);
				pw.println("This is my content");
				pw.println(10000);
				pw.close();
				System.out.println("Done");
		}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
        }
	}
