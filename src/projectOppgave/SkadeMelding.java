package projectOppgave;

import java.util.Date;

public class SkadeMelding {
	
	private Date dato;
	private int skadeNummer;
	private int TypeSkade;
	private String beskrivelse;
	//private List<SkadeBildet> skadeBilder;
	private String vitnerKontaktInfo;
	private double takseringBeløp;
	private double utbetaltErstatningsBeløp;
	
	public Date getDato() {
		return dato;
	}

	public void setDato(Date dato) {
		this.dato = dato;
	}

	public int getSkadeNummer() {
		return skadeNummer;
	}

	public void setSkadeNummer(int skadeNummer) {
		this.skadeNummer = skadeNummer;
	}

	public int getTypeSkade() {
		return TypeSkade;
	}

	public void setTypeSkade(int typeSkade) {
		TypeSkade = typeSkade;
	}

	public String getBeskrivelse() {
		return beskrivelse;
	}

	public void setBeskrivelse(String beskrivelse) {
		this.beskrivelse = beskrivelse;
	}

	public String getVitnerKontaktInfo() {
		return vitnerKontaktInfo;
	}

	public void setVitnerKontaktInfo(String vitnerKontaktInfo) {
		this.vitnerKontaktInfo = vitnerKontaktInfo;
	}

	public double getTakseringBeløp() {
		return takseringBeløp;
	}

	public void setTakseringBeløp(double takseringBeløp) {
		this.takseringBeløp = takseringBeløp;
	}

	public double getUtbetaltErstatningsBeløp() {
		return utbetaltErstatningsBeløp;
	}

	public void setUtbetaltErstatningsBeløp(double utbetaltErstatningsBeløp) {
		this.utbetaltErstatningsBeløp = utbetaltErstatningsBeløp;
	}

	public SkadeMelding(Date dato, int typeSkade) {
		super();
		this.dato = dato;
		TypeSkade = typeSkade;
	}
}
