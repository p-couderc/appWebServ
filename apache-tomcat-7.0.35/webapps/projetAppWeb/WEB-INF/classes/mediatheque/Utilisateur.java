package mediatheque;

import java.util.ArrayList;

public class Utilisateur {
	
	private String password;
	

	private String nom;
	private int typeUtil;
	private ArrayList<Document> lesDocs;
	private int idUtil;
	
	public Utilisateur(int idUtil, String nom, String password, ArrayList<Document>docsEmpr, int typeUtil) {
		this.idUtil = idUtil;
		this.nom = nom;
		this.password = password;
		this.typeUtil = typeUtil;
		this.lesDocs = new ArrayList<Document>();
	}
	
	public int getIdUtil() {
		return idUtil;
	}

	public int getType() {
		return this.typeUtil;
	}
	
	public String getPassword() {
		return password;
	}

	public String getNom() {
		return nom;
	}

	public ArrayList<Document> getLesDocs() {
		return lesDocs;
	}
	
	public void setDocs(ArrayList<Document> docs) {
		this.lesDocs = docs;
	}
}
