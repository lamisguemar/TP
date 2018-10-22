import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;


public class ServeurRestaurant {
	public static void main(String args[]) throws Exception {
		    ServerSocket serverSockett = new ServerSocket(1092);
			Socket sockett =  serverSockett.accept();	
            int nbreRest=3;
            int id=1;
		    BufferedReader reader = new BufferedReader(new InputStreamReader(sockett.getInputStream()));
		    PrintWriter writer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(sockett.getOutputStream())), true);
		    System.out.println("Bonjour");
		    try {	
		    String requete = "";
			while (true) {
				String line = reader.readLine();
				if (line == null || line.equals("END"))
					break;
				if (!requete.equals("")) {
					requete += "/n";    }
				requete += line; 		}
			    String response = "Réponse du serveur\nEND";
			    writer.println(response);
			
			
			System.out.println("Bienvenue,voici la moyenne de chaque restaurant:");
			while (id <= nbreRest){
				System.out.println("pour restaurant "+id+":");
				GestionRest.MoyNouriture();
				GestionRest.MoySalle();
				GestionRest.MoyService();
			    GestionRest.MoyennneRestaurant();
  
			    id=id+1;
			}
			
			
			System.out.println("voici le classement des restaurants:");
			GestionRest.Classement();
			
			
			
			
			    int  noteNouriture=(int)(Math.random()*20);
	    	    int noteSalle=(int)(Math.random()*20);
	    	    int noteService=(int)(Math.random()*20);
	    	    int moyen;
		     	
		  	       System.out.println("avez vous visité un de ces restaurants?");
		     	   boolean rép ;
		     	   Scanner lir =new Scanner(System.in);
		     	   rép =lir.hasNextBoolean();
		     	   
		  	    if (rép=true) {	
		  		    System.out.println("entrez votre avis s.v.p");	
		  		    System.out.println("quel restaurant vous avez visité");
		  		    Scanner lire =new Scanner(System.in);
		  		    int  nm =lire.nextInt();
		  		    
			        System.out.println("donnez la note de nouriture s.v.p");
			        int nb1 =lire.nextInt();
			        noteNouriture = (noteNouriture+nb1)/2;
			        System.out.println("la moyenne de nouriture soit:"+noteNouriture);
				       
			        System.out.println("donnez la note de salle s.v.p");
			        int nb2 = lire.nextInt();
			        noteSalle=(noteSalle+nb2)/2;                                                              
			        System.out.println("la moyenne de salle soit:"+noteSalle);
			        
			        System.out.println("donnez la note de service s.v.p");
			        int nb3 = lire.nextInt();
			        noteService=(noteService+nb3)/2;
			        System.out.println("la moyenne de salle soit:"+noteService);
			        
			        moyen=(noteNouriture+noteSalle+noteService)/3;
			        System.out.println("la moyenne de ce restaurant soit:"+moyen);
			        System.out.println("^ Merci ^");
					
		  	    }
		  	    else{
		  	    	if (rép = false)
		  	    	 System.out.println("Merci");
		  	    }
		  	    
			reader.close();
			writer.close();
			sockett.close();
		    }
		    catch (Exception e) {
			e.printStackTrace(); 		} 	
	}
	
}
