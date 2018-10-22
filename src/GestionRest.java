import java.util.Random;


public class GestionRest {
	static int id;
	static int noteNouriture;
	static int noteSalle;
	static int noteService;
	static int moy;
	public GestionRest(int id,int noteNouriture,int noteSalle,int noteService,int moy){
		this.id=id;
		this.noteNouriture=noteNouriture;
		this.noteSalle=noteSalle;
		this.noteService=noteService;
		this.moy=moy;
	}
	public static void MoyNouriture (){
		 noteNouriture=(int)(Math.random()*20);
		System.out.println("la moyenne de nouriture est:"+noteNouriture);
		
	}
	
	public static void MoySalle(){
		 noteSalle=(int)(Math.random()*20);
		System.out.println("la moyenne de salle est:"+noteSalle);
	}
	
	public static void MoyService( ){
		 noteService=(int)(Math.random()*20);
		System.out.println("la moyenne de service est:"+noteService);
	}
	
    public static void MoyennneRestaurant(){
    	 moy=(noteNouriture+ noteSalle+ noteService)/3;
    	System.out.println("la moyenne est:"+moy);
    
    }
    
    public static void Classement(){
    	int moy1=(int)(Math.random()*20);
    	int moy2=(int)(Math.random()*20);
    	int moy3=(int)(Math.random()*20);
    	
    	if ((moy1>moy2)&&(moy1>moy3)){
    		System.out.println("restauraunt1:" +moy1);
    		if(moy2>moy3){
				System.out.println("restauraunt2:"+moy2);
    		    System.out.println("restauraunt3:"+moy3);
    		}
		    else{
			if(moy3>moy2){
			System.out.println("restauraunt3:"+moy3);
			System.out.println("restauraunt2:"+moy2);
		    }
		    }
    	}
    	else{
    		if ((moy2>moy1)&&(moy2>moy3)){
    				System.out.println("restauraunt2:"+moy2);
    				if(moy1>moy3){
    					System.out.println("restauraunt1:"+moy1);
    				    System.out.println("restauraunt3:"+moy3);
    				}
        	        else{
        			   
    					 if(moy3>moy1){
    					      System.out.println("restauraunt3:"+moy3);
    					      System.out.println("restauraunt1:"+moy1);
    					 }
    				 }
        	        
    		}
    		else{
    			if((moy3>moy1)&&(moy3>moy2)){
    			System.out.println("restauraunt3:"+moy3);
    				if(moy1>moy2){
    				System.out.println("restauraunt1:"+moy1);
    				System.out.println("restauraunt2:"+moy2);
    				}
    				else{
    					if(moy2>moy1){
    					System.out.println("restauraunt2:"+moy2);
    					System.out.println("restauraunt1:"+moy1);
    					}
    				}
    			}
    		}
    				
    			
    		
    		
    	}
    }
}
