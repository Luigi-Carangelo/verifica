import java.util.ArrayList;
import javax.swing.*;

public class Studio {
	private ArrayList<Cliente> gestioneClienti;//dichiarazione array di Cliente
	
	public Studio() {
		gestioneClienti = new ArrayList<Cliente>();//allocazione di array Cliente
	}
	
	//passo un oggetto Cliente e poi restituisco 
	//il valore del metodo .add della libreria ArrayList
	//true = inserito con successo
	//false = non inserito
 	public boolean aggiungi(Cliente temp) {
		return gestioneClienti.add(temp);
	}
	
 	
 	/*
 	 * controllo prima se l'arrai è vuoto con != 0
 	 * se è pieno passo alla scansione dle cliente tramite il metodo toString presente nella classe CLiente
 	 * poi ne stampo l'output.
 	 * 
 	 */
	public boolean visualizzaClienti() {
		if(gestioneClienti.size()!=0) {
			String out="";
			for(Cliente temp : gestioneClienti) {
				out+=temp;
			}
			JOptionPane.showMessageDialog(null, "-----CLIENTI-----\n"+out);
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * controllo pre ogni cliente il giorno e l'orario
	 * poi lo inserisco nella variabile out
	 * stampo out 
	 */
	public boolean visualizzaGiorno10() {
		String out="";
		for(Cliente temp: gestioneClienti) {
			if(temp.getGiorno_visita() == 10 && temp.getOrario_Visita() < 20.0) {
				out += temp;
			}
			
		}
		//se out == "" vuol dire che nessun cliente è stato trovato
		if(!out.equals("")) {
			JOptionPane.showMessageDialog(null, "-----Clienti-----\n"+out);
			return true; 
		}else {
			return false;
		}
	}
	
	
	/*
	 * controllo l'età di ogni cliente 
	 * poi lo inserisco nella variabile out
	 * stampo al variabile out
	 */
	public boolean visualizzaEta() {
		String out="";
		for(Cliente temp: gestioneClienti) {
			if(temp.getEta() > 20 && temp.getEta() < 30) {
				out += temp;
			}
			
		}
		//se out == "" vuol dire che nessun cliente è stato trovato
		if(!out.equals("")) {
			JOptionPane.showMessageDialog(null, "-----Clienti-----\n"+out);
			return true; 
		}else {
			return false;
		}
	}
	
	/*
	 * creo un Cliente temporaneo e metto una variabile contatore index per tenre traccia dello scorrimento dell'array
	 * scorro l'array e se trovo il cliente prendo l'oggeto in posizione index
	 * lo modifico e lo scambio col vecchio cliente in modo da aggiornarlo
	 * 
	 */
	public boolean modifica(String nome, String cognome, int giorno_Visita, int mese_Visita) {
		Cliente temporaneo;
		int index = 0;
		for(Cliente temp: gestioneClienti) {
			if(nome.equals(temp.getNome())&& cognome.equals(temp.getCognome())) {
				temporaneo = gestioneClienti.get(index);
				temporaneo.setGiorno_visita(giorno_Visita);
				temporaneo.setMese_Visita(mese_Visita);
				gestioneClienti.set(index, temporaneo);
				return true;
				
			}
			index++;
		}
		
		return false;
		
	}
	
}
