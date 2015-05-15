package projectOppgave.models;

public class Erstatning {
	
	private double beløp;
	private SkadeMelding melding;
	
	public Erstatning(SkadeMelding mld, double beløp) {
		super();
		
		this.beløp = beløp;
		this.melding = mld;
	}

	/**
	 * @return the beløp
	 */
	public double getBeløp() {
		return beløp;
	}

	/**
	 * @param beløp the beløp to set
	 */
	public void setBeløp(double beløp) {
		this.beløp = beløp;
	}

	/**
	 * @return the melding
	 */
	public SkadeMelding getMelding() {
		return melding;
	}

	/**
	 * @param melding the melding to set
	 */
	public void setMelding(SkadeMelding melding) {
		this.melding = melding;
	}
}
