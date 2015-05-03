package projectOppgave;

import java.util.Date;
import java.util.List;

public class Kunde extends Person {
	
	private Date registreringsDato;
	private int registreringsNummer;
	private List<Forsikring> forsikringer;
	private double årligPremier;
	private double total;
	//private List<SkadeMelding> skadeMeldinger;
	private double utbetalteErstatninger; //?? List??
	
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

	public double getUtbetalteErstatninger() {
		return utbetalteErstatninger;
	}

	public void setUtbetalteErstatninger(double utbetalteErstatninger) {
		this.utbetalteErstatninger = utbetalteErstatninger;
	}
	
}
