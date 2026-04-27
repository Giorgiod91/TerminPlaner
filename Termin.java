
public class Termin {
	// instance variable
	private String title;
	private String description;
	private int due_date;

	// Konstanten für min und max stufe
	public static final int MAX_STUFE = 3;
	public static final int MIN_STUFE = 1;

	private int stufe;

	// Constructor
	public Termin(String title, String description, int due_date) {
		super();
		this.title = title;
		this.description = description;
		this.due_date = due_date;
	}

	// Setter Getter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title != null) {
			this.title = title;
		} else {
			this.title = "Ohne Titel";
		}

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		if (description != null) {
			this.description = description;
		} else {
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

	// methods
	/**
	 * Diese Methode setzt die dringlochkeit anhand von user input
	 * 
	 * @param stufe
	 * @return
	 */
	public String setDringlichkeit(int stufe) {
		String neue_stufe = "";
		// nur wenn die übergebene Stufe auch größer ist als die interne festgelegte Stufe (MIN_STUFE als Konstante)
		if (stufe > MIN_STUFE) {
			switch (stufe) {
				case 1:
					neue_stufe = "grün";
					break;
				case 2:
					neue_stufe = "gelb";
					break;
				case 3:
					neue_stufe = "rot";
					break;
				default:
					break;
			}
		}
		return neue_stufe;
	}
	
	
	
	// Funktion um neu Termine anzulegen
	/**
	 * 
	 * @param title
	 * @param description
	 * @param due_date
	 * @return
	 */
	public Termin hinzufuegen(String title, String description, int due_date) {
	    Termin neuerTermin = new Termin(title, description, due_date);
	    return neuerTermin;
	}

}
