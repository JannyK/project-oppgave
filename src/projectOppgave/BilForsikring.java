package projectOppgave;

import java.util.Date;

public class BilForsikring extends Forsikring {
	private Person bilEier;
	private int registreringsNummber;
	private String bilType;
	private String modell;
	private int registreringsÅr;
	private double kjøreLengde;
	private double prisPerKilometer;
	private String bonus;
	
	public BilForsikring(Date dato, String betingelser, double premier, Person eier) {
		super(dato, betingelser, premier);
		
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

	public String getBilType() {
		return bilType;
	}

	public void setBilType(String bilType) {
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
}
