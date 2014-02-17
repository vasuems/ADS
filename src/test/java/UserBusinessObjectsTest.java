package test.java;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Test;

import com.ads.businessentities.User;
import com.ads.businessobjects.UserBusinessObject;

public class UserBusinessObjectsTest {

	UserBusinessObject bobj = new UserBusinessObject();
		@Before
		  public void setUp() throws Exception {
		    // NiceMocks return default values for
		    // unimplemented methods
		    		    
		  }
		//Test method
		  @Test
		  public void testAddUser() {
			  User inputUser = new User();
			  inputUser.setFirstName("Vasu ");
			  inputUser.setLastName("Devan");
			  User expectedUser = new User();
			  expectedUser.setFirstName("Vasu ");
			  expectedUser.setLastName("Devan");
			  expectedUser.setId(100);
		    // Setting up the expected value of the method call
		    //expect(bobj.Add(inputUser)).andReturn(expectedUser);
		    // Setup is finished need to activate the mock
		    User returnedUser = null;
		    try {
		      returnedUser = bobj.Add(inputUser);
		      //fail("Exception did not occur");
		    } catch (RuntimeException e) {

		    }
		    assertEquals("Expecting 100", 100, returnedUser.getId());
		    }
}
