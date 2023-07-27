import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;

public class LogTest 
{
	public static void main(String[] args) 
		{
			Log log1 = new Log("INFO",LocalDateTime.now(),"Batman","I'm Vengance");
			Log log2 = new Log("WARN",LocalDateTime.now(),"Batman","They Think I'm Hiding In The Shadows...But I Am The Shadows.");
			Log log3 = new Log("ERR",LocalDateTime.now(),"Batman","Do you bleed");
			Log log4 = new Log("DEBUG",LocalDateTime.now(),"Batman","Men are brave");
			Log log5 = new Log("FATAL",LocalDateTime.now(),"Batman","What is ur superpower , I'm Rich");
			
			ArrayList logList = new ArrayList();
			System.out.println("Container is ready...");
			
			//adding data [bottle]
			System.out.println("Adding content to container");
			logList.add(log1);
			logList.add(log2);
			logList.add(log3);
			logList.add(log4);
			logList.add(log5);
			System.out.println("Entire content added to container");
			
			//retrieve data from container [straw]
			Iterator logIterator = logList.iterator();
			
			while (logIterator.hasNext())
			{
				Object obj = logIterator.next();
				Log x = (Log) obj;
				System.out.println("Log:  " + x);
			}
			
		}
}

class Log
{
	private String logType;
	private LocalDateTime logDateTime;
	private String logBy;
	private String logMessage;
	public Log(String logType, LocalDateTime logDateTime, String logBy, String logMessage) 
	{
		super();
		this.logType = logType;
		this.logDateTime = logDateTime;
		this.logBy = logBy;
		this.logMessage = logMessage;
	}
	@Override
	public String toString() {
		return "Log [logType=" + logType + ", logDateTime=" + logDateTime + ", logBy=" + logBy + ", logMessage="
				+ logMessage + "]";
	}
	
}