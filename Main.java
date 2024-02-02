import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;

import java.util.Scanner;

//import org.json.*;
import org.json.JSONObject;
import org.json.JSONArray;


public class Main {
static String zipcode;
static boolean validZipcode = false;
private static final String apiKey = "aX6M80ngRgEsC5ZqWjoypCaeWElbLTj2";

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a zipcode");
		while(!validZipcode){
				
		if(keyboard.hasNextInt())
		{
			zipcode = keyboard.next();
			if(zipcode.length()== 5){
			
				
				try {
					
					String weather = getWeather(zipcode);
					
					JSONObject obj = new JSONObject(weather);
					JSONObject o = (JSONObject) obj.get("data");
					JSONArray oo = (JSONArray) o.get("timelines");
					JSONObject ooo = (JSONObject) oo.get(0);
					JSONArray oooo = (JSONArray) ooo.get("intervals");
					JSONObject ooooo = (JSONObject)oooo.get(0); 
					JSONObject wobj1 = (JSONObject)oooo.get(0);
					JSONObject wobj2 = (JSONObject) oooo.get(1);
					JSONObject wobj3 = (JSONObject) oooo.get(2);
					JSONObject wobj11 = (JSONObject) wobj1.get("values");
					JSONObject wobj22 = (JSONObject) wobj2.get("values");
					JSONObject wobj33 = (JSONObject) wobj3.get("values");
					Object six = wobj1.get("startTime");
					Object seven = wobj2.get("startTime");
					Object eight = wobj3.get("startTime");
					Object wobj111 = wobj11.get("weatherCode");
					Object wobj222 = wobj22.get("weatherCode");
					Object wobj333 = wobj33.get("weatherCode");
					Object wobj1111 = wobj11.get("temperature");
					Object wobj2222 = wobj22.get("temperature");
					Object wobj3333 = wobj33.get("temperature");
					
					String[] nine = six.toString().split("T");
					String[] ten = seven.toString().split("T");
					String[] eleven = eight.toString().split("T");
					 String wcode1 = wobj111.toString();
					 String wcode2 = wobj222.toString();
					 String wcode3 = wobj333.toString();
					 
					 System.out.println("Date: ");
					 System.out.println(nine[0]);
					 System.out.println("Weather Condition: ");
					 
					 if(wcode1.contains("1001")) {
						 
						System.out.println("Cloudy"); 
					 }
					 else if(wcode1.contains("0")) {
						 System.out.println("Unkown");
					 }
					 else if(wcode1.contains("1000")) {
						 System.out.println("Clear, Sunny");
					 }
					 else if(wcode1.contains("1100")) {
						 System.out.println("Mostly Clear");
					 }
					 else if(wcode1.contains("1101")) {
						 System.out.println("Partly Cloudy");
					 }
					 else if(wcode1.contains("1102")) {
						 System.out.println("Mostly Cloudy");
					 }
					 else if(wcode1.contains("2000")) {
						 System.out.println("Fog");
					 }
					 else if(wcode1.contains("2100")) {
						 System.out.println("Light Fog");
					 }
					 else if(wcode1.contains("4000")) {
						 System.out.println("Drizzle");
					 }
					 else if(wcode1.contains("4001")) {
						 System.out.println("Rain");
					 }
					 else if(wcode1.contains("4200")) {
						 System.out.println("Light Rain");
					 }
					 else if(wcode1.contains("4201")) {
						 System.out.println("Heavy Rain");
					 }
					 else if(wcode1.contains("5000")) {
						 System.out.println("Snow");
					 }
					 else if(wcode1.contains("5001")) {
						 System.out.println("Flurries");
					 }
					 else if(wcode1.contains("5100")) {
						 System.out.println("Light Snow");
					 }
					 else if(wcode1.contains("5101")) {
						 System.out.println("Heavy Snow");
					 }
					 else if(wcode1.contains("6000")) {
						 System.out.println("Freezing Drizzle");
					 }
					 else if(wcode1.contains("6001")) {
						 System.out.println("Freezing Rain");
					 }
					 else if(wcode1.contains("6200")) {
						 System.out.println("Light Freezing Rain");
					 }
					 else if(wcode1.contains("6201")) {
						 System.out.println("Heavy Freezing Rain");
					 }
					 else if(wcode1.contains("7000")) {
						 System.out.println("Ice Pellets");
					 }
					 else if(wcode1.contains("7101")) {
						 System.out.println("Heavy Ice Pellets");
					 }
					 else if(wcode1.contains("7102")) {
						 System.out.println("Light Ice Pellets");
					 }
					 else if(wcode1.contains("8000")) {
						 System.out.println("Thunderstorm");
					 }
					System.out.println("Temperature: \n" + wobj1111+ "\n");
					
					 System.out.println("Date: ");
					 System.out.println(ten[0]);
					
					
					System.out.println("Weather Condition: ");
					 
					 if(wcode2.contains("1001")) {
						 
						System.out.println("Cloudy"); 
					 }
					 else if(wcode2.contains("0")) {
						 System.out.println("Unkown");
					 }
					 else if(wcode2.contains("1000")) {
						 System.out.println("Clear, Sunny");
					 }
					 else if(wcode2.contains("1100")) {
						 System.out.println("Mostly Clear");
					 }
					 else if(wcode2.contains("1101")) {
						 System.out.println("Partly Cloudy");
					 }
					 else if(wcode2.contains("1102")) {
						 System.out.println("Mostly Cloudy");
					 }
					 else if(wcode2.contains("2000")) {
						 System.out.println("Fog");
					 }
					 else if(wcode2.contains("2100")) {
						 System.out.println("Light Fog");
					 }
					 else if(wcode2.contains("4000")) {
						 System.out.println("Drizzle");
					 }
					 else if(wcode2.contains("4001")) {
						 System.out.println("Rain");
					 }
					 else if(wcode2.contains("4200")) {
						 System.out.println("Light Rain");
					 }
					 else if(wcode2.contains("4201")) {
						 System.out.println("Heavy Rain");
					 }
					 else if(wcode2.contains("5000")) {
						 System.out.println("Snow");
					 }
					 else if(wcode2.contains("5001")) {
						 System.out.println("Flurries");
					 }
					 else if(wcode2.contains("5100")) {
						 System.out.println("Light Snow");
					 }
					 else if(wcode2.contains("5101")) {
						 System.out.println("Heavy Snow");
					 }
					 else if(wcode2.contains("6000")) {
						 System.out.println("Freezing Drizzle");
					 }
					 else if(wcode2.contains("6001")) {
						 System.out.println("Freezing Rain");
					 }
					 else if(wcode2.contains("6200")) {
						 System.out.println("Light Freezing Rain");
					 }
					 else if(wcode2.contains("6201")) {
						 System.out.println("Heavy Freezing Rain");
					 }
					 else if(wcode2.contains("7000")) {
						 System.out.println("Ice Pellets");
					 }
					 else if(wcode2.contains("7101")) {
						 System.out.println("Heavy Ice Pellets");
					 }
					 else if(wcode2.contains("7102")) {
						 System.out.println("Light Ice Pellets");
					 }
					 else if(wcode2.contains("8000")) {
						 System.out.println("Thunderstorm");
					 }
					
					System.out.println("Temperature: \n" + wobj2222+ "\n");
					
					System.out.println("Date: ");
					System.out.println(eleven[0]);
					
					System.out.println("Weather Condition: ");
					 
					 if(wcode2.contains("1001")) {
						 
						System.out.println("Cloudy"); 
					 }
					 else if(wcode3.contains("0")) {
						 System.out.println("Unkown");
					 }
					 else if(wcode3.contains("1000")) {
						 System.out.println("Clear, Sunny");
					 }
					 else if(wcode3.contains("1100")) {
						 System.out.println("Mostly Clear");
					 }
					 else if(wcode3.contains("1101")) {
						 System.out.println("Partly Cloudy");
					 }
					 else if(wcode3.contains("1102")) {
						 System.out.println("Mostly Cloudy");
					 }
					 else if(wcode3.contains("2000")) {
						 System.out.println("Fog");
					 }
					 else if(wcode3.contains("2100")) {
						 System.out.println("Light Fog");
					 }
					 else if(wcode3.contains("4000")) {
						 System.out.println("Drizzle");
					 }
					 else if(wcode3.contains("4001")) {
						 System.out.println("Rain");
					 }
					 else if(wcode3.contains("4200")) {
						 System.out.println("Light Rain");
					 }
					 else if(wcode3.contains("4201")) {
						 System.out.println("Heavy Rain");
					 }
					 else if(wcode3.contains("5000")) {
						 System.out.println("Snow");
					 }
					 else if(wcode3.contains("5001")) {
						 System.out.println("Flurries");
					 }
					 else if(wcode3.contains("5100")) {
						 System.out.println("Light Snow");
					 }
					 else if(wcode3.contains("5101")) {
						 System.out.println("Heavy Snow");
					 }
					 else if(wcode3.contains("6000")) {
						 System.out.println("Freezing Drizzle");
					 }
					 else if(wcode3.contains("6001")) {
						 System.out.println("Freezing Rain");
					 }
					 else if(wcode3.contains("6200")) {
						 System.out.println("Light Freezing Rain");
					 }
					 else if(wcode3.contains("6201")) {
						 System.out.println("Heavy Freezing Rain");
					 }
					 else if(wcode3.contains("7000")) {
						 System.out.println("Ice Pellets");
					 }
					 else if(wcode3.contains("7101")) {
						 System.out.println("Heavy Ice Pellets");
					 }
					 else if(wcode3.contains("7102")) {
						 System.out.println("Light Ice Pellets");
					 }
					 else if(wcode3.contains("8000")) {
						 System.out.println("Thunderstorm");
					 }
					
					System.out.println("Temperature: \n" + wobj3333+ "\n");
					
					return;
					
				  }catch (Exception e) {
					e.printStackTrace();
				}
				
				
				
				return;
			
			
			}
			
			    if (zipcode.length()!= 5){
				System.out.println("invalid zipcode");
				System.out.println("Enter a zipcode");
				validZipcode = false;
			}
		}
			
		 if(!keyboard.hasNextInt()) {
			System.out.println("invalid zipcode");
			System.out.println("Enter a zipcode");
			keyboard.next();
			 
			
		}
		
	}
	}
		public static String getWeather(String zipcode) throws Exception {
			
			String openWeatherConnection = "https://api.tomorrow.io/v4/timelines?location="+ zipcode+ "%20US&fields=temperature,weatherCode&timesteps=1d&startTime=now&endTime=nowPlus48h&units=imperial&apikey="+ apiKey;
			
			URI uri = new URI(openWeatherConnection);
			URL url = uri.toURL();
			HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
			
			BufferedReader read = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
			StringBuilder data = new StringBuilder();
			String line;
			
			while ((line = read.readLine()) != null) {
			data.append(line);
			}
		    read.close();
			return data.toString();
		
}
}
	
		

	


