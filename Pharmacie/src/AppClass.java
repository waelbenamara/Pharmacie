import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class AppClass {
	static Meds meds = new Meds();
	BufferedWriter writer = null;
	FileWriter fn = new FileWriter(fb,true);
	writer = new BufferedWriter(fw);
	public static void main(String[] args) {
		 // authentification();
		
		  updateMeds();
         //loaddata();
          



}
	
////////////Meds Part////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
////////////////////////////////////////////////////////////////////////	
	public static void displayMeds() {
		
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////	
	
     public static void deleteMeds() {
		
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
     public static void addmeds() {
    	 
     }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	public static void authentification() {
		
		
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	public static void loaddata() {
		File file = new File("Meds.txt");
		try {
			Scanner sc = new Scanner(file);
			
			while(sc.hasNext()) {
			meds.getNames().add(sc.next());
			meds.getQuantitities().add(sc.next());
			}
			System.out.println(meds.getNames());
			System.out.println(meds.getQuantitities());
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void updateMeds() {
		
		loaddata();
		File file = new File("Meds.txt");
		displayMeds();
		System.out.println("Please give the nameof the med you want to update");
		Scanner sc =new Scanner(System.in);
		String nameofmed = sc.nextLine();
		int index= meds.getNames().indexOf(nameofmed);
		System.out.println(index);
		System.out.println("Give the new quantity");
		String qty =sc.nextLine();
		meds.getQuantitities().set(index, qty);
		System.out.println(meds.getNames());
		System.out.println(meds.getQuantitities());
		
		
	}
	
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	 


	public static void FirstMenu() {
		System.out.println("#________________________________________________________#");
		System.out.println("#---------------------=Pharmacy App----------------------#");
		System.out.println("#________________________________________________________#");
		System.out.println("#                       Main Menu                        #");
		System.out.println("# _______________________________________________________#");
		System.out.println("#           Choose one of the following options          #");
		System.out.println("#                  1.Manage medecines                    #");
		System.out.println("#                   2.Manage Clients                     #");
		System.out.println("#________________________________________________________#");
	}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	 public static void Menumed() {
	     	System.out.println("#________________________________________________________#");
			System.out.println("#---------------------=Pharmacy App----------------------#");
			System.out.println("#________________________________________________________#");
			System.out.println("#                        Med Menu                        #");
			System.out.println("# _______________________________________________________#");
			System.out.println("#           Choose one of the following options          #");
			System.out.println("#                  1.Add Medecines                       #");
			System.out.println("#               2.Display List of meds                   #");
			System.out.println("#                    3.Delete Med                        #");
			System.out.println("#                    4.Update Med                        #");
			System.out.println("#________________________________________________________#");
	        }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
   
    ///////////////Clients Part/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    
    public static void Menuclients() {
    	
    }
}
