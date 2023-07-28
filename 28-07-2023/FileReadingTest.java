import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReadingTest
{
		public static void main(String[] args) 
		{
			System.out.println("Trying to read a file");
			
			try (FileInputStream fileInputStream = new FileInputStream("Batman.txt")) 
			{
				fileInputStream.read();
				System.out.println("File is open..");
				
				byte theChar=(byte)fileInputStream.read();
				
				while(theChar !=-1)
				{
					System.out.print((char)theChar);
					theChar=(byte)fileInputStream.read();
					Thread.sleep(100);
					
					
				}
				fileInputStream.close();
				System.out.println("File closed ..");
				
			} 
			catch(FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
			catch (IOException e)
			{
				e.printStackTrace();
			}
			System.out.println("Done reading");
		}
}
