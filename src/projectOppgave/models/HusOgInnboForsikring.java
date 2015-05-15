package projectOppgave.models;

import java.util.Date;

public class HusOgInnboForsikring extends Forsikring {
	
	private Adresse boligAdresse;
	private int byggeÅr;
	private String boligType;
	private String byggeMaterialer;
	private String standard;
	private float antallKvadratMeter;
	private float bygningsforsikringsBeløp;
	private float innboforsikringsBeløp;
	private String andreInfo;
	
	public HusOgInnboForsikring(Kunde kunde, Date dato, String betingelser, double premie, double beløp, Adresse boligAdresse) {
		super(kunde, dato, betingelser, premie, beløp);
		
		this.boligAdresse = boligAdresse;
	}

	public Adresse getBoligAdresse() {
		return boligAdresse;
	}

	public void setBoligAdresse(Adresse boligAdresse) {
		this.boligAdresse = boligAdresse;
	}

	public int getByggeÅr() {
		return byggeÅr;
	}

	public void setByggeÅr(int byggeÅr) {
		this.byggeÅr = byggeÅr;
	}

	public String getBoligType() {
		return boligType;
	}

	public void setBoligType(String boligType) {
		this.boligType = boligType;
	}

	public String getByggeMaterialer() {
		return byggeMaterialer;
	}

	public void setByggeMaterialer(String byggeMaterialer) {
		this.byggeMaterialer = byggeMaterialer;
	}

	public String getStandard() {
		return standard;
	}

	public void setStandard(String standard) {
		this.standard = standard;
	}

	public float getAntallKvadratMeter() {
		return antallKvadratMeter;
	}

	public void setAntallKvadratMeter(float antallKvadratMeter) {
		this.antallKvadratMeter = antallKvadratMeter;
	}

	public float getBygningsforsikringsBeløp() {
		return bygningsforsikringsBeløp;
	}

	public void setBygningsforsikringsBeløp(float bygningsforsikringsBeløp) {
		this.bygningsforsikringsBeløp = bygningsforsikringsBeløp;
	}

	public float getInnboforsikringsBeløp() {
		return innboforsikringsBeløp;
	}

	public void setInnboforsikringsBeløp(float innboforsikringsBeløp) {
		this.innboforsikringsBeløp = innboforsikringsBeløp;
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
