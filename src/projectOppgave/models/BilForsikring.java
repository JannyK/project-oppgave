package projectOppgave.models;

import java.util.Calendar;

public class BilForsikring extends Forsikring {
	
	public enum BilType {
        PERSON_BIL, LASTE_BIL
    }
	
	private Person bilEier;
	private int registreringsNummber;
	private BilType bilType;
	private String modell;
	private int registreringsÅr;
	private double kjøreLengde;
	private double prisPerKilometer;
	private String bonus;
	private String andreInfo;
	
	public BilForsikring(Kunde kunde, Calendar dato, String betingelser, double premie, double beløp, Person eier) {
		super(kunde, dato, betingelser, premie, beløp);
		
		this.setBilEier(eier);
	}

	public Person getBilEier() {
		return bilEier;
	}

	public void setBilEier(Person bilEier) {
		this.bilEier = bilEier;
	}

	public int getRegistreringsNummber() {
		return registreringsNummber;
	}

	public void setRegistreringsNummber(int registreringsNummber) {
		this.registreringsNummber = registreringsNummber;
	}

	public BilType getBilType() {
		return bilType;
	}

	public void setBilType(BilType bilType) {
		this.bilType = bilType;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public int getRegistreringsÅr() {
		return registreringsÅr;
	}

	public void setRegistreringsÅr(int registreringsÅr) {
		this.registreringsÅr = registreringsÅr;
	}

	public double getKjøreLengde() {
		return kjøreLengde;
	}

	public void setKjøreLengde(double kjøreLengde) {
		this.kjøreLengde = kjøreLengde;
	}

	public double getPrisPerKilometer() {
		return prisPerKilometer;
	}

	public void setPrisPerKilometer(double prisPerKilometer) {
		this.prisPerKilometer = prisPerKilometer;
	}

	public String getBonus() {
		return bonus;
	}

	public void setBonus(String bonus) {
		this.bonus = bonus;
	}

	/**
	 * @return the andreInfo
	 */
	public String getAndreInfo() {
		return andreInfo;
	}

	/**
	 * @param andreInfo the andreInfo to set
	 */
	public void setAndreInfo(String andreInfo) {
		this.andreInfo = andreInfo;
	}
}
