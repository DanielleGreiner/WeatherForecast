import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.Calendar;


public class Log {
	//sets log length and clears it when full
	public static void logLength(File file, int max) {
	 try {
		if (file.length() > max) {
	
		     Path path = file.toPath();
		     Files.write(path, new byte[0], StandardOpenOption.TRUNCATE_EXISTING);
		     Log.log(LogType.INFO, "Successfully cleared log file as max length was exceeded");
		     
		 }
	} catch (Exception e) {
		System.out.println("An unknown error occured");
	}
	}
	//sets log type from config class and parses it on time, type and message
	public static void log(LogType type, String message) {
		if(!Config.LOGGING) {
			return;
		}
		
		String entry = Log.getTimestamp() + ":" + type + ":" + message + "\n";
		
		logf(entry);
		logc(entry);
	}
	//same thing as above but includes more information
	public static void log(LogType type, String message, String className, String methodName) {
		if(!Config.LOGGING) {
			return;
		}
		
		
		String entry = Log.getTimestamp() + ":" + type + ":" + className + ":" + methodName + ":" + message + "\n";
		
		logf(entry);
		logc(entry);
	}
	//writes entry to log file
	private static void logf(String entry) {
		FileWriter fw;
		
		try {
			fw = new FileWriter(Config.LOG_FILENAME, true);
			fw.write(entry);
			fw.close();
		} catch (IOException e) {
			if(Config.DEBUG) {
				e.printStackTrace();
			}
		}
	}
	//prints entry to console
	public static void logc(String entry) {
		System.out.println(entry);
	}
	//initiates what is in time stamp for log
	private static String getTimestamp() {
		Calendar now = Calendar.getInstance();
		
		String timestamp = now.get(Calendar.YEAR) + "" +
	    		(now.get(Calendar.MONTH) + 1) + "" +
	    		now.get(Calendar.DAY_OF_MONTH) + "" +
	    		"-" + 
	    		now.get(Calendar.HOUR_OF_DAY) + "" +
	    		now.get(Calendar.MINUTE) + "" + 
	    		now.get(Calendar.SECOND) + "";
		
		return timestamp;
	}
}
