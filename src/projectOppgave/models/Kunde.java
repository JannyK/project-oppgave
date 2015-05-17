package projectOppgave.models;

import java.util.Calendar;
import java.util.Date;
import java.util.Formatter;
import java.util.List;

public class Kunde extends Person {
	
	private static int REGISTRERINGSNUMMER_INCREMENTER = 1;
	
	private Calendar registreringsDato;
	private int registreringsNummer;
	
	private List<Forsikring> forsikringer;
	private List<SkadeMelding> skadeMeldinger;
	private List<Erstatning> utbetalteErstatninger;
	
	private double årligPremier;
	private double total;
	
	public Kunde(String n, Adresse adr, int alder) {
		super(n, adr, alder);
		
		this.registreringsNummer = REGISTRERINGSNUMMER_INCREMENTER++;
	}
	
	public Calendar getRegistreringDato() {
		return registreringsDato;
	}
	
	public void setRegistreringsDato(Calendar date) {
		this.registreringsDato = date;
	}
	
	public int getRegistreringsNummer() {
		return registreringsNummer;
	}
	
	public void setRegistreringsNummer(int num) {
		this.registreringsNummer = num;
	}
	
	public List<Forsikring> getForsikringer() {
		return forsikringer;
	}
	
	public void setForsikringer(List<Forsikring> forsikringer) {
		this.forsikringer = forsikringer;
	}

	public double getÅrligPremier() {
		return årligPremier;
	}

	public void setÅrligPremier(double årligPremier) {
		this.årligPremier = årligPremier;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	/*
	 * Determine if a Kunde is totalKunde
	 */
	
	/**
	 * @return the skadeMeldinger
	 */
	public List<SkadeMelding> getSkadeMeldinger() {
		return skadeMeldinger;
	}

	/**
	 * @param skadeMeldinger the skadeMeldinger to set
	 */
	public void setSkadeMeldinger(List<SkadeMelding> skadeMeldinger) {
		this.skadeMeldinger = skadeMeldinger;
	}

	/**
	 * @return the utbetalteErstatninger
	 */
	public List<Erstatning> getUtbetalteErstatninger() {
		return utbetalteErstatninger;
	}

	/**
	 * @param utbetalteErstatninger the utbetalteErstatninger to set
	 */
	public void setUtbetalteErstatninger(List<Erstatning> utbetalteErstatninger) {
		this.utbetalteErstatninger = utbetalteErstatninger;
	}

	public boolean erTotalKunde() {
		//TODO: Implement
		
		
		return false;
	}
	
	@Override
	public String toString() {
		
        Formatter fmt = new Formatter();
        fmt.format("%tc", this.getRegistreringDato());
        	
		StringBuilder sb = new StringBuilder();
		sb.append("PATIENT: "+ this.getRegistreringsNummer() + "\n");
		sb.append("Name: "+ this.getNavn() + "\n");
		sb.append("Alder: "+ this.getAlder() + "\n");
		sb.append("Registreringsdata: "+ fmt + "\n");
		sb.append("Adresse: "+ 
				this.getAdresse().getGateAdresse() + " " +
				this.getAdresse().getGateNummer() + ", "+ 
				this.getAdresse().getPostNummer() + " "+ 
				this.getAdresse().getBy() + " "+
				this.getAdresse().getLand() + "\n");
		
		return sb.toString();
	}
	
}
