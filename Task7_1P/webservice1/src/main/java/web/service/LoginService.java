package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
	    
	    if (username == null || password == null || dob == null) {
	        return false;
	    }

	    username = username.trim();
	    password = password.trim();
	    dob = dob.trim();

	    if (username.isEmpty() || password.isEmpty() || dob.isEmpty()) {
	        return false;
	    }

	    if ("ahsan".equals(username) && "ahsan_pass".equals(password) && "1990-01-01".equals(dob)) 
	    {
	        return true;
	    }

	    return false;
	}
	
	
}
