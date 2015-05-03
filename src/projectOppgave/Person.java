package projectOppgave;

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
}
