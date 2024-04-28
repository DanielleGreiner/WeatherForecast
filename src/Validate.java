import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
	
public static boolean zipcode(String zipcode) {
	if(zipcode.length() != 5)
		return false;
	
	Pattern p = Pattern.compile("[0-9]{5}");
	Matcher m = p.matcher(zipcode);
	return m.matches();
	

}

public static boolean api(String weather){
	
   if(weather.length() > 5000)
	   return false;

    Pattern p = Pattern.compile("\\{\"data\":\\{\"timelines\":\\[\\{\"timestep\":\"1d\",\"endTime\":\"[^\"]+\",\"startTime\":\"[^\"]+\",\"intervals\":\\[\\{\"startTime\":\"[^\"]+\",\"values\":\\{\"temperature\":\\d+\\.\\d+,\"weatherCode\":\\d+\\}\\}(,\\{\"startTime\":\"[^\"]+\",\"values\":\\{\"temperature\":\\d+\\.\\d+,\"weatherCode\":\\d+\\}\\})*\\]\\}\\]\\}\\}");
    Matcher m = p.matcher(weather);
    return m.matches();
}
	
}
