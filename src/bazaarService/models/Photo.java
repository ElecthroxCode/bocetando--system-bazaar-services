package bazaarService.models;

public class Photo {
	private String id;
	private String title;
	private String url;
	private String designLevel = "normal";
	
	public Photo() {
		super();
	}

	public Photo(String id, String title, String url) {
		super();
		this.id = id;
		this.title = title;
		this.url = url;
	
	}
	
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getDesignLevel() {
		return designLevel;
	}

	public void setDesignLevel(String designLevel) {
		this.designLevel = designLevel;
	}

	@Override
	public String toString() {
		return "Photo [id=" + id + ", title=" + title + ", url=" + url + ", designLevel=" + designLevel + "]";
	}
	
	
	
}
