package projectOppgave.models;

import java.util.Date;

public class BåtForsikring extends Forsikring {
	
	public enum BåtType {
		PERSON_BÅT,
		STOR_BÅT,
		CRUISE_BÅT
	}
	
	private Person båtEier;
	private int registreringsNummber;
	private BåtType båtType;
	private String modell;
	private float lengde;
	private String årsModell;
	private String motorType;
	private float motorStyrke;
	private String andreInfo;
	
	public BåtForsikring(Kunde kunde, Date dato, String betingelser, double premie, double beløp, Person eier) {
		super(kunde, dato, betingelser, premie, beløp);
		
		this.setBåtEier(eier);
	}
	
	public Person getBåtEier() {
		return båtEier;
	}

	public void setBåtEier(Person båtEier) {
		this.båtEier = båtEier;
	}

	public int getRegistreringsNummber() {
		return registreringsNummber;
	}

	public void setRegistreringsNummber(int registreringsNummber) {
		this.registreringsNummber = registreringsNummber;
	}

	public BåtType getBåtType() {
		return båtType;
	}

	public void setBåtType(BåtType båtType) {
		this.båtType = båtType;
	}

	public String getModell() {
		return modell;
	}

	public void setModell(String modell) {
		this.modell = modell;
	}

	public float getLengde() {
		return lengde;
	}

	public void setLengde(float lengde) {
		this.lengde = lengde;
	}

	public String getÅrsModell() {
		return årsModell;
	}

	public void setÅrsModell(String årsModell) {
		this.årsModell = årsModell;
	}

	public String getMotorType() {
		return motorType;
	}

	public void setMotorType(String motorType) {
		this.motorType = motorType;
	}

	public float getMotorStyrke() {
		return motorStyrke;
	}

	public void setMotorStyrke(float motorStyrke) {
		this.motorStyrke = motorStyrke;
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
