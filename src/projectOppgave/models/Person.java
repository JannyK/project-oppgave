package projectOppgave.models;

public class Person {
	private String navn;
	private String adresse;
	private int alder;
	
	public Person(String name, String adr, int age) {
		this.navn = name;
		this.alder = age;
		this.adresse = adr;
	}
	
	public void setNavn(String n) {
		this.navn = n;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setAlder(int a) {
		this.alder = a;
	}
	
	public int getAlder() {
		return alder;
	}
	
	public void setAdresse(String adr) {
		this.adresse = adr;
	}
	
	public String getAdresse() {
		return adresse;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((adresse == null) ? 0 : adresse.hashCode());
		result = prime * result + ((navn == null) ? 0 : navn.hashCode());
		
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		
		if (this == obj) return true;
		if (obj == null) return false;
		if (getClass() != obj.getClass()) return false;
		
		Person other = (Person) obj;
		if (adresse == null) {
			if (other.adresse != null)
				return false;
		} else if (!adresse.equals(other.adresse))
			return false;
		if (navn == null) {
			if (other.navn != null)
				return false;
		} else if (!navn.equals(other.navn))
			return false;
		return true;
	}
}
