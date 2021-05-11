package Methods;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class reader {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
         BufferedReader br = null;
         String line;
         try {
        	 br = new BufferedReader(new FileReader("C:\\Users\\pavan\\eclipse-workspace\\Placement Accelarator\\fileName.txt"));
             while((line=br.readLine())!=null) {
            	 System.out.println(line);
             }
         }catch(IOException e) {
        	 e.printStackTrace();
         }finally {
        	 try {
        		 br.close();
        	 }catch(IOException e) {
        		 e.printStackTrace();
        	 }
         }
	}

}
