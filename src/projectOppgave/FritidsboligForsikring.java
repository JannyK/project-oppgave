package projectOppgave;

import java.util.Date;

public class FritidsboligForsikring extends Forsikring {
	
	private String boligAdresse;
	private int byggeÅr;
	private String boligType;
	private String byggeMaterialer;
	private String standard;
	private float antallKvadratMeter;
	private float bygningsforsikringsBeløp;
	private float innboforsikringsBeløp;
	private double utleie;
	
	public FritidsboligForsikring(Date dato, String betingelser, double premier, String boligAdresse) {
		super(dato, betingelser, premier);
		
		this.boligAdresse = boligAdresse;
	}

	public String getBoligAdresse() {
		return boligAdresse;
	}

	public void setBoligAdresse(String boligAdresse) {
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

	public double getUtleie() {
		return utleie;
	}

	public void setUtleie(double utleie) {
		this.utleie = utleie;
	}
}
