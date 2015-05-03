package projectOppgave;

import java.util.Date;

public class ReiseForsikring extends Forsikring {
	
	private String forsikringsOmråde;
	private double forsikringsSum;
	
	public ReiseForsikring(Date dato, String betingelser, double premier, String område) {
		super(dato, betingelser, premier);
		
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
