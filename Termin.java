
public class Termin {
	// instance variable
	private String title;
	private String description;
	private int due_date;
	
	// Constructor
	public Termin(String title, String description, int due_date) {
		super();
		this.title = title;
		this.description = description;
		this.due_date = due_date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if(title !=null) {
			this.title = title;
		}else {
			this.title = "Ohne Titel";
		}
		
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if(description != null) {
		this.description = description;
		}else {
			this.description = "Keine Description";
		}
	}

	public int getDue_date() {
		return due_date;
	}

	public void setDue_date(int due_date) {
		this.due_date = due_date;
	}
	
	
	
	// setter getter
	
	
	
	
	
	
	
	//methods
	
	public void setDringlichkeit() {
		
	}
	
	
	
	
	
	

}
