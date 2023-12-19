package bazaarService.models;

import java.util.ArrayList;
import java.util.List;

public class CompanyService {
 private String name;
 private String description;
 private double basePriceService;
 private List<Photo> photos = new ArrayList<Photo>();
public CompanyService() {
	super();
}
public CompanyService(String name, String description, double price) {
	super();
	this.name = name;
	this.description = description;
	this.basePriceService = price;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public double getPrice() {
	return basePriceService;
}
public void setPrice(double price) {
	this.basePriceService = price;
}
public void addPhoto(Photo photo) {
	photos.add(photo);
}

public void showPhotos() {
	for(Photo p : photos) {
		System.out.println(p.toString());
	}
}

public String getDesignLevelPhoto(String i) {
	String designLevel = "";
	
	for(Photo p : photos) {
		if(p.getId().equals(i)) {
			designLevel = p.getDesignLevel();
			return designLevel;
		}
		
	}
	return designLevel;
}

@Override
public String toString() {
	return "Services [name=" + name + ", description=" + description + ", price=" + basePriceService + ", photos=" + photos + "]";
}

}
