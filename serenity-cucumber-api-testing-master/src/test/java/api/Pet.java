package api;

import java.util.List;

public class Pet {
	
	private int id;
	private String category;
	private String name;
	private String status;
	private  List<String> photoUrls;
	
	public Pet(String value, String key) {
        this.name=value;
        this.status=key;
	}
	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getStatus() {
		return status;
	}
	
	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public List<String> getPhotoUrls() {
		return photoUrls;
	}

	public void setPhotoUrls(List<String> photoUrls) {
		this.photoUrls = photoUrls;
	}

	public void setId(int id2) {
		this.id = id2;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
