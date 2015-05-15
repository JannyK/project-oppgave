package projectOppgave.models;

import java.util.Date;

public class ReiseForsikring extends Forsikring {
	
	private String forsikringsOmråde;
	private double forsikringsSum;
	
	public ReiseForsikring(Kunde kunde, Date dato, String betingelser, double premie, double beløp, String område) {
		super(kunde, dato, betingelser, premie, beløp);
		
		this.forsikringsOmråde = område;
	}

	public String getForsikringsOmråde() {
		return forsikringsOmråde;
	}

	public void setForsikringsOmråde(String forsikringsOmråde) {
		this.forsikringsOmråde = forsikringsOmråde;
	}

	public double getForsikringsSum() {
		return forsikringsSum;
	}

	public void setForsikringsSum(double forsikringsSum) {
		this.forsikringsSum = forsikringsSum;
	}
}