package afpa.mail.services;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

import afpa.util.entity.SendMail;

public class Services {
	public boolean readFile(String login, String mdp) throws IOException {
		boolean valid = true;
		FileReader fr = new FileReader("C:\\webApp\\log.txt");
		BufferedReader br = new BufferedReader(fr) ;
		while (br.ready()) {
			String[] tab = br.readLine().split("=");
			if ("login".equals(tab[0])) {
				if (! tab[1].equals(login)) {
					valid = false;
				}
			}
			else if ("Pass".equals(tab[0])) {
				if (! tab[1].equals(mdp)) {
					valid = false;
				}
			}
		}
		br.close();
		return valid;
	}

	
	public void writeFile(String login, String pass, String nom, String prenom, String adresse, String tel) throws IOException {
		String concat = login +";"+ pass +";"+ nom +";"+ prenom +";"+ adresse +";"+ tel;
		FileWriter fr = new FileWriter("C:\\webApp\\personne.txt");
		BufferedWriter br = new BufferedWriter(fr) ;
		br.write(concat);
		br.close();
		
	}
	
	public void sendMail(String destinataire, String objet, String Message) throws AddressException, MessagingException, IOException {

		SendMail.envoieMail(destinataire, objet, Message);
		
	}

	public void jeFaisUneBonneFonction(String destinataire, String objet, String Message) throws AddressException, MessagingException, IOException {

		SendMail.envoieMail(destinataire, objet, Message);
		
	}

}
