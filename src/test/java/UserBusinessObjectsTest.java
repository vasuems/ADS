//testing pull request for techcom demo.

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
		  public void testUserId() {
			  User returnUser = null;
			  User user = new User();
			  user.setId(1);
			    try {
			    	returnUser = bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting 100", 1, returnUser.getId());
		    }
		  @Test
		  public void testUserFirstName() {
			  User returnUser = null;
			  User user = new User();
			  user.setFirstName("Techcom");;
			    try {
			    	returnUser = bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting Techcom", "Techcom", returnUser.getFirstName());
		    }
		  @Test
		  public void testUserLastName() {
			  User returnUser = null;
			  User user = new User();
			  user.setFirstName("User");;
			    try {
			    	returnUser = bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting Techcom", "User", returnUser.getLastName());
		    }
}
