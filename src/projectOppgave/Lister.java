package projectOppgave;

import java.util.HashSet;
import java.util.Set;

public class Lister {
	
	private Set<Kunde> kundeliste;
	private Set<BilForsikring> bilForsikringer;
	private Set<BåtForsikring> båtForsikringer;
	private Set<FritidsboligForsikring> fritidsboligForsikringer;
	private Set<HusOgInnboForsikring> husOgInnboForsikringer;
	private Set<ReiseForsikring> reiseForsikringer;
	private Set<Forsikring> allForsikringer;

	
    public Lister() {
    	this.kundeliste = new HashSet<Kunde>();
    	this.bilForsikringer = new HashSet<BilForsikring>();
    	this.båtForsikringer = new HashSet<BåtForsikring>();
    	this.fritidsboligForsikringer = new HashSet<FritidsboligForsikring>();
    	this.husOgInnboForsikringer = new HashSet<HusOgInnboForsikring>();
    	this.reiseForsikringer = new HashSet<ReiseForsikring>();
    	this.allForsikringer = new HashSet<Forsikring>();
    }
  
    
    public Set<Kunde> getKundeliste() {
		return kundeliste;
	}

	public void setKundeliste(Set<Kunde> kundeliste) {
		this.kundeliste = kundeliste;
	}

	public Set<BilForsikring> getBilForsikringer() {
		return bilForsikringer;
	}

	public void setBilForsikringer(Set<BilForsikring> bilForsikringer) {
		this.bilForsikringer = bilForsikringer;
	}

	public Set<BåtForsikring> getBåtForsikringer() {
		return båtForsikringer;
	}

	public void setBåtForsikringer(Set<BåtForsikring> båtForsikringer) {
		this.båtForsikringer = båtForsikringer;
	}

	public Set<FritidsboligForsikring> getFritidsboligForsikringer() {
		return fritidsboligForsikringer;
	}

	public void setFritidsboligForsikringer(
			Set<FritidsboligForsikring> fritidsboligForsikringer) {
		this.fritidsboligForsikringer = fritidsboligForsikringer;
	}

	public Set<HusOgInnboForsikring> getHusOgInnboForsikringer() {
		return husOgInnboForsikringer;
	}

	public void setHusOgInnboForsikringer(
			Set<HusOgInnboForsikring> husOgInnboForsikringer) {
		this.husOgInnboForsikringer = husOgInnboForsikringer;
	}

	public Set<ReiseForsikring> getReiseForsikringer() {
		return reiseForsikringer;
	}
	
	public void setReiseForsikringer(Set<ReiseForsikring> reiseForsikringer) {
		this.reiseForsikringer = reiseForsikringer;
	}

	public Set<Forsikring> getAllForsikringer() {
		return allForsikringer;
	}

	public void setAllForsikringer(Set<Forsikring> allForsikringer) {
		this.allForsikringer = allForsikringer;
	}

	
	/*
	 * Utility Methods
	 */
	
	//TODO: implement
	public boolean leggTilKunde(Kunde k) {
		return true;
	}
	
	//TODO: implement
	public void leggTilBilForsikring(BilForsikring bf) {
		
	}
	
	//TODO: implement
	public void leggTilBåtForsikring(BåtForsikring bf) {
		
	}
	
	//TODO: implement
	public void leggTilFritidsboligForsikring(FritidsboligForsikring fbf) {
		
	}
	
	//TODO: implement
	public void leggTilHusForsikring(HusOgInnboForsikring hf) {
		
	}
	
	//TODO: implement
	public void leggTilReiseForsikring(ReiseForsikring rf) {
		
	}
}
