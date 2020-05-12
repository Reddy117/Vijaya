package stepDefinitions;

import com.kart.pageobjects.HomePage;
import com.kart.pageobjects.LandPage;
import com.kart.util.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class KartSteps extends BaseClass{

	LandPage lp;
	HomePage hp=new HomePage();
	@Given("^go to website and login using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void go_to_Website(String uName,String pasWord){
		initialize("chrome");
		lp=new LandPage();
		lp.doLogin(uName, pasWord);
	}
	

	@When("^add product to kart using \"([^\"]*)\" and \"([^\"]*)\"$")
	public void add_product_to_kart(String arg1,String arg2) throws Throwable {
		hp=new HomePage();
		hp.addProductToKart(arg1, arg2, "Text");
	}

	@Then("^prduct should be added to kart$")
	public void prduct_should_be_added_to_kart() throws Throwable {
	   
	}
	
	
}
