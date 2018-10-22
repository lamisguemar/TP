import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Random;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;


public class ClientRest {
	public static void main(String args[]) throws IOException {
	
		try {	 
			Socket sockett = new Socket("localhost", 1092);
			 
            PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sockett.getOutputStream())), true);
            BufferedReader reader = new BufferedReader(new InputStreamReader(sockett.getInputStream()));
            String requete = "Bonjour, Ma note est : \nEND";
			writer.println(requete);
			String response = "";
			while (true) {
				String line = reader.readLine();
				if (line == null || line.equals("END")) {
					break; 				}
				if (!response.equals("")) {
					response += "/n"; 				}
				response += line; 	}
				System.out.println("je veux voir la moyenne de chaque restaurant et leurs classement s.v.p");
				writer.close();
				reader.close();
				sockett.close();
		} 
		catch (Exception e) {e.printStackTrace();}		

}
}