package api.stepsdefinitions;

import api.Pet;
import api.steps.PetsStoreSteps;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class PetsStoreStepsDefinitions {
	
	@Steps
	PetsStoreSteps step;
	
	    @When("i add the pet {string} to the store with state {string}")
		public void shouldBeAbleToAddPetsToAStore(String name, String status) {
			Pet whiteHair = new Pet(name, status);
			step.when_i_add_the_pet_to_the_store(whiteHair);
		}
	    
	    @Then("the pet should be available")
	   	public void thePetShouldBeAvailable() {
	   		step.the_pets_should_be_available();
	   	}
	    
	    @When("i delete the pet from the store")
		public void shouldBeAbleDeletePetsFromAStore() {
			step.when_i_delete_the_pet();
		}

		@Then("the pets should be not available")
		public void thePetShouldBeNotAvailable() {
			step.the_pets_should_be_not_available();
		} 
	
	
		@When("i update the pet status as {string}")
	    public void shouldBeAbleUpdatePetState(String status) {
			step.when_i_update_the_pet_status(status);
			
		}
		
		@Then("the pet should be updated")
		public void thePetShouldBeUpdated() {
			step.the_pet_should_be_updated();
		} 
		
		@When("i search the pets with status {string} from the web store")
		public void shouldBeAbleToFindPetsByStatus(String status) {
			step.find_all_pets_by_status(status);
		}
		
		@Then("i should receive success status from the searching by {string}")
		public void shouldReceiveSuccess(String status) {
			step.theStoreContainPetsByStatus(status);
		} 
}                                                                   