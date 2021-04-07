package api.steps;

import static net.serenitybdd.rest.SerenityRest.rest;
import static org.hamcrest.Matchers.equalTo;
import java.util.Random;
import api.Pet;
import io.restassured.path.json.JsonPath;
import net.thucydides.core.annotations.Step;

public class PetsStoreSteps {

	private Pet pet;
	private String jsonPet;
	private JsonPath petsInStore;
    
	@Step
	public void when_i_add_the_pet_to_the_store(Pet pet) {
		this.pet = pet;
		int id = Math.abs(new Random().nextInt());
		this.jsonPet = "{\"id\": " + id + " , \"name\": \"" + pet.getName() + "\", \"photoUrls\": [], \"status\": \""
				+ pet.getStatus() + "\"}";

		rest().given().contentType("application/json").with().body(jsonPet).when()
				.post("https://petstore.swagger.io/v2/pet");

		this.pet.setId(id);
	}
	@Step
	public void the_pets_should_be_available() {
		rest().get("https://petstore.swagger.io/v2/pet/" + pet.getId()).then().statusCode(200).and().body("name",
				equalTo(pet.getName()));
	}
	@Step
	public void when_i_delete_the_pet() {
		rest().given().contentType("application/json").with().body(jsonPet)
				.delete("https://petstore.swagger.io/v2/pet/" + pet.getId()).then().statusCode(200);
	}
	@Step
	public void the_pets_should_be_not_available() {
		rest().get("https://petstore.swagger.io/v2/pet/" + pet.getId()).then().statusCode(404);
	}
	@Step
	public void when_i_update_the_pet_status(String status) {
		this.jsonPet = "{\"id\": " + pet.getId() + " , \"name\": \"" + pet.getName()
				+ "\", \"photoUrls\": [], \"status\": \"" + status + "\"}";

		rest().given().contentType("application/json").with().body(jsonPet).when()
				.put("https://petstore.swagger.io/v2/pet");
	}
	@Step
	public void the_pet_should_be_updated() {
		rest().get("https://petstore.swagger.io/v2/pet/" + pet.getId()).then().statusCode(200).and().body("name",
				equalTo(pet.getName()));
	}
	@Step
	public void find_all_pets_by_status(String status) {
		setPetsInStore(
				rest().get("https://petstore.swagger.io/v2/pet/findByStatus?status=" + status).getBody().jsonPath());
	}
	@Step
	public void theStoreContainPetsByStatus(String status) {
		rest().get("https://petstore.swagger.io/v2/pet/findByStatus?status=" + status).then().statusCode(200);
	}

	public JsonPath getPetsInStore() {
		return petsInStore;
	}

	public void setPetsInStore(JsonPath jsonPath) {
		this.petsInStore = jsonPath;
	}
}
