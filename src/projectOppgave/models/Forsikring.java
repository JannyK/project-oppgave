package projectOppgave.models;

import java.util.Date;

public class Forsikring {
	
	private Kunde forsikringsKunde;
	private double årligPremie;
	private Date dato;
	private String betingelser;
	private double beløp;
	
	public Forsikring() {
		this.årligPremie = 0;
		this.dato = new Date();
		this.betingelser = "En Enkel forsikring";
	}
	
	public Forsikring(Kunde k, Date dato, String betingelser, double premie, double beløp) {
		super();
		
		this.forsikringsKunde = k;
		this.dato = dato;
		this.betingelser = betingelser;
		this.årligPremie = premie;
		this.beløp = beløp;
	}
	
	/**
	 * @return the forsikringsKunde
	 */
	public Kunde getForsikringsKunde() {
		return forsikringsKunde;
	}

	/**
	 * @param forsikringsKunde the forsikringsKunde to set
	 */
	public void setForsikringsKunde(Kunde forsikringsKunde) {
		this.forsikringsKunde = forsikringsKunde;
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
	
	public double getÅrligPremie() {
		return årligPremie;
	}
	
	public void setÅrligPremie(double p) {
		this.årligPremie = p;
	}

	/**
	 * @return the beløp
	 */
	public double getBeløp() {
		return beløp;
	}

	/**
	 * @param beløp the beløp to set
	 */
	public void setBeløp(double beløp) {
		this.beløp = beløp;
	}
}