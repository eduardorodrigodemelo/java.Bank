package Program;

public class People {
	
	private static int counter = 1;
	
	private String name;
	private String document;
	private String email;
	

	public People(String name, String document, String email) {
		super();
		this.name = name;
		this.document = document;
		this.email = email;
		counter += 1;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDocument() {
		return document;
	}
	public void setDocument(String document) {
		this.document = document;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\nName:  " + this.getName() +
				"\nDocument: " + this.getDocument() +
				"\nEmail: " + this.getEmail();
	}

}

