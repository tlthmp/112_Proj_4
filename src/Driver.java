/* Ty Thompson
 CSCI 112_Proj_4
 Joey and Aussie helped me 
 */

public class Driver{
	public static void main(String[] args){
		Policy[] polymorphs = new Policy[7];
//				
		polymorphs[0] = new Policy("098721",2001,2000,"Bob Jones", "498 Price St.", "Memphis", "TN", 1970);
		polymorphs[1] = new Motorcycle_Policies("109823", 2015, 2500,"Susan Reid", "10 Williams Ave.", "Tupelo", "MS", 1997 , "Scooter", "057-87523", 2015, 0);
		polymorphs[2] = new Motorcycle_Policies("209784", 1990, 2500, "John Smith", "25 Smith Dr.", "Oxord", "MS", 1980,  "Cruiser", "652-67598", 1980, 1 );
		polymorphs[3] = new Motorcycle_Policies("015236", 2015, 2500, "Mike Hunt", "37 Brown Rd.", "Bruce", "MS", 1998,  "SportBike", "375-83647", 2009, 2);
		polymorphs[4] = new Health_Policies("035267", 1990, 5000, "Martha Benet", "76 Crown Rd.", "Batesville", "MS",1950, false, 130 );
		polymorphs[5] = new Health_Policies("102873", 2014, 5000,"Debra Cook", "36 Turnage Dr.", "Byhalia", "MS", 1975, true, 180 );
		polymorphs[6] = new Health_Policies("082736", 2014, 5000, "Mark Ingram", "83 Jackson Ave.", "Oxford", "MS", 1990, false, 220 );
		for (int i = 0; i < polymorphs.length; i++){
			polymorphs[i].PrintData();
			System.out.println();
			
		}
	}
	
		
	
	}
	

