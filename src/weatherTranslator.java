
public class weatherTranslator {
	//accepts JSON object on weather code, date and temperature
	public static void weatherTrans(String wcode1, String [] number,Object wobj1111 ) throws Exception{
		//accepts and outputs date
		System.out.println("Date: ");
		 System.out.println(number[0]);
		 System.out.println("Weather Condition: ");
		//translates weather code to name
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
		 	//accepts and outputs temperature 
		 	System.out.println("Temperature: \n" + wobj1111+ "\n");
		
	}
	
}
