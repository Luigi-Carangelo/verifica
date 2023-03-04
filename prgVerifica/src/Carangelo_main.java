import javax.swing.*;

public class Carangelo_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Studio gestione = new Studio();
		 String nome, cognome;
		 int giorno_Visita, mese_Visita, eta, scelta;
		 double prezzo_Visita, orario_Visita;
		 Cliente temp;//è un cliente temporaneo
		 
		 do {
			 scelta=Integer.parseInt(JOptionPane.showInputDialog("------MENU-----\n"
						+ " 1)inserire N clienti (N<=5)\n"
						+ "	2)visualizzare tutte le persone inserite\n"
						+ "	3)visualizzare le persone prenotate il giorno 10 prima delle ore 20.00\n"
						+ "	4)visualizzare le persone con eta compresa tra 20 e 30 anni\n"
						+ "	5)modificare data di prenotazione di un cliente\n"
						+ " 0)esci"));
			 switch(scelta) {
			 case 0:
				 JOptionPane.showMessageDialog(null, "Arrivederci!");
				 break;
				 
			 case 1:
				 int nClienti;
				 /*
				  * chiedo il numero di clienti e controllo se sono <= 5
				  */
				 do {
						nClienti = Integer.parseInt(JOptionPane.showInputDialog("quanti clienti si vogliono inserire? (max 5)"));
						if(!(nClienti<=5)) {
							JOptionPane.showMessageDialog(null, "ERRORE: valore non valido riprovare!");
						}
						
					}while(!(nClienti<=5));
				 /*
				  * con un ciclo for per ogni cliente chiedo i dati e lo aggiungo
				  */
				 for(int i=0; i<nClienti; i++) {
					 nome = JOptionPane.showInputDialog("inserire il nome del cliente");
					 cognome = JOptionPane.showInputDialog("inserire cognome del cliente");
					 giorno_Visita = Integer.parseInt(JOptionPane.showInputDialog("inserire giorno della visita"));
					 mese_Visita = Integer.parseInt(JOptionPane.showInputDialog("inserire il mese di visita in numeri"));
					 eta = Integer.parseInt(JOptionPane.showInputDialog("inserire eta del cliente"));
					 orario_Visita = Double.parseDouble(JOptionPane.showInputDialog("inserire orario visita in formato 00.00"));
					 prezzo_Visita = Double.parseDouble(JOptionPane.showInputDialog("inserire prezzo visita"));
					 
					 //variabile temporanea per facilitare la creazione dell'oggetto
					 temp = new Cliente( nome,  cognome,  giorno_Visita,  mese_Visita,  eta,  prezzo_Visita, orario_Visita);
					 
					 if(gestione.aggiungi(temp)) {
						 JOptionPane.showMessageDialog(null, "Cliente aggiunto con successo!");
					 }else {
						 JOptionPane.showMessageDialog(null, "Cliente non aggiunto!");
					 }
					 
					}
				 
				 break;
				 
			 case 2:
				 if(!gestione.visualizzaClienti()) {
					 JOptionPane.showMessageDialog(null, "Nessun cliente inserito!");
				 }
				 break;
				 
			 case 3:
				 if(!gestione.visualizzaGiorno10()) {
					 JOptionPane.showMessageDialog(null, "Nessun cliente prenotato il giorno 10 prima delle ore 20.00");
				 }
				 break;
				 
			 case 4:
				 if(!gestione.visualizzaEta()) {
					 JOptionPane.showMessageDialog(null, "Nessun cliente con eta compresa fra 20 e 30 anni");
				 }
				 break;
				 
			 case 5:
				 /*
				  * chiedo i dati necessari
				  */
				 nome = JOptionPane.showInputDialog("inserire il nome del cliente");
				 cognome = JOptionPane.showInputDialog("inserire cognome del cliente");
				 giorno_Visita = Integer.parseInt(JOptionPane.showInputDialog("inserire giorno della visita"));
				 mese_Visita = Integer.parseInt(JOptionPane.showInputDialog("inserire il mese di visita in numeri"));
				 
				 if(gestione.modifica(nome, cognome, giorno_Visita, mese_Visita)) {
					 JOptionPane.showMessageDialog(null, "Cliente aggiornato con successo!");
				 }else {
					 JOptionPane.showMessageDialog(null, "Cliente non trovato!");
				 }
				 break;
				 
				 //se scelta non è presente nel menù da un messaggio di errore
			 default:
				 JOptionPane.showMessageDialog(null, "valore non valido riprovare!");
				 break;
			 }
			 
		 }while(scelta!=0);
	}

}
