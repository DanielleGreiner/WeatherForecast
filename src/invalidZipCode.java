import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class invalidZipCode {

	@Test
    public void testInvalidZipCode() {
        String invalidZipCode = "sdfWq"; 
        assertFalse(Validate.zipcode(invalidZipCode));
    }
	
	  @Test
	    public void testInvalidZipCodeTooShort() {
	        String invalidZipCode = "064"; 
	        assertFalse(Validate.zipcode(invalidZipCode));
	    }
	  
	  @Test
	    public void testInvalidZipCodeTooLong() {
	        String invalidZipCode = "555555555"; 
	        assertFalse(Validate.zipcode(invalidZipCode));
	    }
	  
	  @Test
	    public void testInvalidZipCodeIsEmpty() {
	        String invalidZipCode = ""; 
	        assertFalse(Validate.zipcode(invalidZipCode));
	    }
	  @Test
	    public void testInvalidZipCodeIsSpecialChars() {
	        String invalidZipCode = "!@#%^"; 
	        assertFalse(Validate.zipcode(invalidZipCode));
	    }
	
}
