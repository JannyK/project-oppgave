package projectOppgave.models;

import java.util.Calendar;

public class Forsikring {
	
	private String registreringsNummer;
	private Kunde forsikringsKunde;
	private double årligPremie;
	private Calendar dato;
	private String betingelser;
	private double beløp;
	
	public Forsikring() {
		this.årligPremie = 0;
		this.dato = Calendar.getInstance();
		this.betingelser = "En Enkel forsikring";
	}
	
	public Forsikring(Kunde k, Calendar dato, String betingelser, double premie, double beløp) {
		super();
		
		this.forsikringsKunde = k;
		this.dato = dato;
		this.betingelser = betingelser;
		this.årligPremie = premie;
		this.beløp = beløp;
	}
	
	/**
	 * @return the registreringsNummer
	 */
	public String getRegistreringsNummer() {
		return registreringsNummer;
	}

	/**
	 * @param registreringsNummer the registreringsNummer to set
	 */
	public void setRegistreringsNummer(String registreringsNummer) {
		this.registreringsNummer = registreringsNummer;
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

	public Calendar getDato() {
		return dato;
	}
	
	public void setDato(Calendar d) {
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