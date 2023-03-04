
public class Cliente {
	private String nome, cognome;
	private int giorno_Visita, mese_Visita, eta;
	private double prezzo_Visita, orario_Visita;
	
	
	
	public Cliente(String nome, String cognome, int giorno_Visita, int mese_Visita, int eta, double prezzo_Visita,
			double orario_Visita) {
		this.nome = nome;
		this.cognome = cognome;
		this.giorno_Visita = giorno_Visita;
		this.mese_Visita = mese_Visita;
		this.eta = eta;
		this.prezzo_Visita = prezzo_Visita;
		this.orario_Visita = orario_Visita;
	}
	public String getNome() {
		return nome;
	}
	
	
	public double getOrario_Visita() {
		return orario_Visita;
	}
	
	public String getCognome() {
		return cognome;
	}
	
	public int getGiorno_visita() {
		return giorno_Visita;
	}
	public void setGiorno_visita(int giorno_visita) {
		giorno_Visita = giorno_visita;
	}
	public int getMese_Visita() {
		return mese_Visita;
	}
	public void setMese_Visita(int mese_Visita) {
		this.mese_Visita = mese_Visita;
	}
	public int getEta() {
		return eta;
	}
	
	@Override
	public String toString() {
		return "Cliente [Nome=" + nome + ", cognome=" + cognome + ", Giorno_visita=" + giorno_Visita + ", mese_Visita="
				+ mese_Visita + ", eta=" + eta + ", Prezzo_Visita=" + prezzo_Visita + ", orario_Visita=" + orario_Visita
				+ "]\n";
	}
}
