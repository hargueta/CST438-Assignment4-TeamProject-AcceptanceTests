package feature.likes;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;

public class LikeSteps {
	static Map<String, List<String>> userCollection;
	String userEmail;
	
	static {
		userCollection = new HashMap<String, List<String>>();
		
		List<String> harguetaList = new ArrayList<String>();
		harguetaList.add("Django Unchained");
		harguetaList.add("Interstellar");
		harguetaList.add("Ex Machina");
		userCollection.put("hargueta@csumb.edu", harguetaList);
		
		List<String> ychinoList = new ArrayList<String>();
		ychinoList.add("Sisters");
		ychinoList.add("The Proposal");
		userCollection.put("ychino@csumb.edu", ychinoList);
	}
	
	@When("^a user with a unique email address (.*) requests movies he/she likes$")
	public void user_with_unique_email(String email) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    this.userEmail = email;
	}

	@Then("^the movie (.*) is returned$")
	public void the_movie_returned_is(String movie) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    List<String> movieList = LikeSteps.userCollection.get(userEmail);
	    
	    Assert.assertEquals(true, movieList.contains(movie));
	}

}
