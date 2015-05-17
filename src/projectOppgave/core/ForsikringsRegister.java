package projectOppgave.core;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import projectOppgave.models.Adresse;
import projectOppgave.models.BilForsikring;
import projectOppgave.models.BåtForsikring;
import projectOppgave.models.Erstatning;
import projectOppgave.models.Forsikring;
import projectOppgave.models.FritidsboligForsikring;
import projectOppgave.models.HusOgInnboForsikring;
import projectOppgave.models.Kunde;
import projectOppgave.models.ReiseForsikring;
import projectOppgave.models.SkadeMelding;

public class ForsikringsRegister {
	
	private List<Forsikring> allForsikringer;
	private List<SkadeMelding> skadeMeldinger;

	
    public ForsikringsRegister() {
    	this.allForsikringer = new ArrayList<Forsikring>();
    	this.skadeMeldinger = new ArrayList<SkadeMelding>();
    }

	/**
	 * @return the bilForsikringer
	 */
	public List<Forsikring> bilForsikringer() {
		
		List<Forsikring> bf = this.allForsikringer.stream()
				.filter(f -> f.getClass() == BilForsikring.class)
				.collect(Collectors.toCollection(ArrayList::new));
		
		return bf;	
	}
	
	public BilForsikring finnBilForsikring(String regNummer) {
		
		List <Forsikring> forsikringer = this.bilForsikringer();
		BilForsikring match = null;
		
		for (Forsikring bf : forsikringer) {
			if (bf.getRegistreringsNummer().equalsIgnoreCase(regNummer)) {
				match = (BilForsikring)bf;
				break;
			}
		}
		
		return match;
	}

	/**
	 * @return the båtForsikringer
	 */
	public List<Forsikring> båtForsikringer() {
		return this.allForsikringer.stream()
				.filter(f -> f.getClass() == BåtForsikring.class)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	/**
	 * @return the fritidsboligForsikringer
	 */
	public List<Forsikring> fritidsboligForsikringer() {
		return this.allForsikringer.stream()
				.filter(f -> f.getClass() == FritidsboligForsikring.class)
				.collect(Collectors.toCollection(ArrayList::new));
	}


	/**
	 * @return the husOgInnboForsikringer
	 */
	public List<Forsikring> husOgInnboForsikringer() {
		return this.allForsikringer.stream()
				.filter(p -> p.getClass() == HusOgInnboForsikring.class)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	/**
	 * @return the reiseForsikringer
	 */
	public List<Forsikring> reiseForsikringer() {
		return this.allForsikringer.stream()
				.filter(r -> r.getClass() == ReiseForsikring.class)
				.collect(Collectors.toCollection(ArrayList::new));
	}

	/**
	 * @return the allForsikringer
	 */
	public List<Forsikring> getAllForsikringer() {
		return allForsikringer;
	}
	
	public boolean nyForsikring(Forsikring f) {
		return this.allForsikringer.add(f);
	}
	
	/*
	 * skademelding registreres på gjeldende kunde, 
	 * under forutsetning at kunden har forsikring for 
	 * den aktuelle skadetypen
	 */
	public boolean nySkadeMelding(SkadeMelding sm) {
		return this.skadeMeldinger.add(sm);
	}
}
