package projectOppgave.models;

import java.util.Date;
import java.util.List;

public class Kunde extends Person {
	
	private Date registreringsDato;
	private int registreringsNummer;
	
	private List<Forsikring> forsikringer;
	private List<SkadeMelding> skadeMeldinger;
	private List<Erstatning> utbetalteErstatninger;
	
	private double årligPremier;
	private double total;
	
	public Kunde(String n, String adr, int alder) {
		super(n, adr, alder);
	}
	
	public Date getRegistreringDato() {
		return registreringsDato;
	}
	
	public void setRegistreringsDato(Date date) {
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

	/**
	 * @return the registreringsDato
	 */
	public Date getRegistreringsDato() {
		return registreringsDato;
	}

	public boolean erTotalKunde() {
		//TODO: Implement
		
		
		return false;
	}
	
}
