package projectOppgave;

import java.util.Date;

public class Forsikring {
	
	private double årligPremier;
	private Date dato;
	private String betingelser;
	
	public Forsikring() {
		this.årligPremier = 0;
		this.dato = new Date();
		this.betingelser = "En Enkel forsikring";
	}
	
	public Forsikring(Date dato, String betingelser, double premier) {
		this.dato = dato;
		this.betingelser = betingelser;
		this.årligPremier = premier;
	}
	
	public Date getDato() {
		return dato;
	}
	
	public void setDato(Date d) {
		this.dato = d;
	}
	
	public String getBetingelser() {
		return betingelser;
	}
	
	public void setBetingelser(String b) {
		this.betingelser = b;
	}
	
	public double getÅrligPremier() {
		return årligPremier;
	}
	
	public void setÅrligPremier(double p) {
		this.årligPremier = p;
	}
}