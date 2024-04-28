import java.io.File;

public class Secret {
	//api key
	public static final String apiKey = "aX6M80ngRgEsC5ZqWjoypCaeWElbLTj2";
	//file permissions
	public static void filePerm(File file) {
	file.setExecutable(false);
	file.setReadable(true, true);
	file.setWritable(true, true);
	}
	
	
}

