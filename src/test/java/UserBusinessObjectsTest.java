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
			  User user = new User();
			  user.setId(1);
			    try {
			    		bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting 100", 1, user.getId());
		    }
		  @Test
		  public void testUserFirstName() {
			  User user = new User();
			  user.setFirstName("Techcom");;
			    try {
			    		bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting Techcom", "Techcom", user.getFirstName());
		    }
		  @Test
		  public void testUserLastName() {
			  User user = new User();
			  user.setFirstName("User");;
			    try {
			    		bobj.Add(user);
			    		//fail("Exception did not occur");
			    } catch (RuntimeException e) {
	
			    }
			    assertEquals("Expecting Techcom", "User", user.getLastName());
		    }
}
