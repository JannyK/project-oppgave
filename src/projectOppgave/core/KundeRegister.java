package projectOppgave.core;

import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import projectOppgave.models.Kunde;

public class KundeRegister {
	
	private Set<Kunde> kundeliste;
	
	public KundeRegister() {
		super();
		
		this.kundeliste = new HashSet<Kunde>();
	}

	/**
	 * @return the kundeliste
	 */
	public Set<Kunde> getKundeliste() {
		return kundeliste;
	}

	/**
	 * @param kundeliste the kundeliste to set
	 */
	public void setKundeliste(Set<Kunde> kundeliste) {
		this.kundeliste = kundeliste;
	}
	
	
	/**
	 * Utiity methods
	 *
	 */
	
	//TODO: implement
	public boolean nyKunde(Kunde k) {
		Calendar cal = Calendar.getInstance();
		k.setRegistreringsDato(cal);
		
		return this.kundeliste.add(k);
	}
	
	public Kunde finnKunde(String kundeNanv) {
		Iterator<Kunde> it = this.kundeliste.iterator();
		
		while(it.hasNext()) {
			Kunde k = it.next();
			
			if (k.getNavn().equalsIgnoreCase(kundeNanv)){
				return k;
			}else{
				continue;
			}
		}
		
		return null;
	}
	
	public Kunde finnKunde(int regNummer) {
		Kunde match = null;
		for (Kunde k: this.kundeliste) {
			if (k.getRegistreringsNummer() == regNummer) {
				match = k;
				break;
			}
		}
		
		return match;
	}
	
	public boolean slettKunde(Kunde k) {		
		return this.kundeliste.remove(k);
	}
	
	
	public String visKunde(int kundeNr) {
		return this.finnKunde(kundeNr).toString();
	}
}
