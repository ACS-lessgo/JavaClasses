//import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWritingTest
{
		public static void main(String[] args) 
		{
			System.out.println("Trying to read a file");
			
			try
			{
				FileOutputStream fileOutputStream = new FileOutputStream("Batman.txt",true);
				System.out.println("File is ready to  write");
				
				String str="Batman is ready for cleaning Gotham city \n";
				
				byte array[]=str.getBytes();
				fileOutputStream.write(array);
				System.out.println("String written to file");
				
				System.out.println("File is closed...");
				fileOutputStream.close();
				
				
			} 
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
//			catch(InterruptedException e)
//			{
//				e.printStackTrace();
//			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("Done writing");
		}
}
