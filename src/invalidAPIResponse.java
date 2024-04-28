import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class invalidAPIResponse {

	@Test
    public void testInvalidAPIResponse() {
        String invalidAPIResponse = "{\"data\":{\"timelines\":[{\"timestep\":\"1d\",\"endTime\":\"!@ac-#2-zzT@!:z0:00Z\",\"startTime\":\"2024-01-27T11:00:00Z\",\"intervals\":[{\"startTime\":\"2024-01-27T11:00:00Z\",\"values\":{\"temperature\":48.2,\"weatherCode\":4200}},{\"startTime\":\"2024-01-28T11:00:00Z\",\"values\":{\"temperature\":37.73,\"weatherCode\":4200}},{\"startTime\":\"2024-01-29T11:00:00Z\",\"values\":{\"temperature\":ad.cd,\"weatherCode\":1001}}]}]}}"; 
        assertFalse(Validate.api(invalidAPIResponse));
    }  
	  @Test
	    public void testInvalidAPIResponseIsEmpty() {
	        String invalidAPIResponse = ""; 
	        assertFalse(Validate.api(invalidAPIResponse));
	    }
	
}
