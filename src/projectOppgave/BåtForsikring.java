package projectOppgave;

import java.util.Date;

public class BåtForsikring extends Forsikring{
	private Person båtEier;
	private int registreringsNummber;
	private String båtType;
	private String modell;
	private float lengde;
	private String årsModell;
	private String motorType;
	private float motorStyrke;
	
	public BåtForsikring(Date dato, String betingelser, double premier, Person eier) {
		super(dato, betingelser, premier);
		
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

	public String getBåtType() {
		return båtType;
	}

	public void setBåtType(String båtType) {
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
}
