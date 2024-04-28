import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class validZipCode {

	  @Test
	    public void testValidZipCode() {
	        String zipCode = "12345";
	        assertTrue(Validate.zipcode(zipCode));
	    }

}
