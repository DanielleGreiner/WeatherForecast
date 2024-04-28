import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

public class getWeather {


public static String getWeather(String zipcode) throws Exception {
	//set api request
	String openWeatherConnection = "https://api.tomorrow.io/v4/timelines?location="+ zipcode+ "%20US&fields=temperature,weatherCode&timesteps=1d&startTime=now&endTime=nowPlus48h&units=imperial&apikey="+ Secret.apiKey;
	//set up connection
	URI uri = new URI(openWeatherConnection);
	URL url = uri.toURL();
	HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
	
	BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
	StringBuilder data = new StringBuilder();
	String line;
	//retrieve all data from api
	while ((line = read.readLine()) != null) {
	data.append(line);
	}
    read.close();
	return data.toString();

}
}
