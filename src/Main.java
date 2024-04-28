import java.io.File;
import java.util.Scanner;
import org.json.JSONObject;
import org.json.JSONArray;

public class Main {
	
static String zipcode;
static boolean validZipcode = false;
static int max = 1000;

	public static void main(String[] args) throws Exception {
	    
		File file = new File(Config.LOG_FILENAME);
		//set log file permissions
		Secret.filePerm(file);
		//set log file max length 
		Log.logLength(file, max);
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a zipcode");
		zipcode = keyboard.next();
		
		while(!validZipcode){
			//Validates zipcode with validate class
			if(!Validate.zipcode(zipcode)) {
				
				System.out.println("Invalid zipcode");
				System.out.println("Enter a zipcode");
				zipcode = keyboard.next();
				
				Log.log(LogType.INFO, "Unsuccessfully submitted zipcode");
				
			}
			//When zipcode is valid, sent to api to retrieve weather forecast
			else {
				
				 Log.log(LogType.INFO, "Successfully submitted zipcode");
				
					//retrives api data for location
					String weather = getWeather.getWeather(zipcode);
					
					//validates the received api response
					if(!Validate.api(weather)) {
						
						System.out.println("Invalid API response please try again later");
						Log.log(LogType.INFO, "Invalid API response received, program quitting");
						return;
						
					}
					//if api response is valid program continues
					else {
					Log.log(LogType.INFO, "Zipcode successfully accepted through API");  
					
					//breaking down the JSON to get to desired data
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
					
					//selecting day 1 data 
					weatherTranslator.weatherTrans(wcode1, nine, wobj1111);
					//selecting day 2 data
					weatherTranslator.weatherTrans(wcode2, ten, wobj2222);
					//selecting day 3 data
					weatherTranslator.weatherTrans(wcode3, eleven, wobj3333);
					
					Log.log(LogType.INFO, "API output successfully translated to 3 day forecast");  
					
				   return;
					}
			}	
			
		}
	}
}
	
		

	


