


	import java.io.BufferedWriter;
	import java.io.File;
	import java.io.FileNotFoundException;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.Scanner;

	public class AppClass {
		static Meds meds = new Meds();
		
		public static void main(String[] args) throws IOException {
			 //this is for test delete if you want 
			
			FirstMenu();
			



	}
		
	////////////Med Part////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	////////////////////////////////////////////////////////////////////////	
		public static void clearscreen() {
		System.out.print("\033[H\033[2J");  
	    System.out.flush();  
		}
		
		
		public static void displayMeds() {
			loaddata();
			Scanner input = new Scanner("Meds.txt");
			
			while (input.hasNextLine())
			{
			   System.out.println(input.nextLine());
			}
			input.close();
		}
	////////////////////////////////////////////////////////////////////////////////////////////////	
		
	     public static void deleteMeds() {
			
			
		}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////    
	     public static void addmeds() throws IOException {
	    	 
	    	 Scanner fr = new Scanner (System.in);
	    	 FileWriter fw = null;
	    	 BufferedWriter bw = null;
	    	 PrintWriter out = null;
	             
	    	 System.out.print ("Name of the new medicine: ");
	    	 String newMed = fr.nextLine();
	    	 System.out.println ("Quantity of the new medicine: ");
	    	 int x = fr.nextInt();
	    	 
	    	 fw = new FileWriter("Meds.txt", true);
	    	 bw = new BufferedWriter(fw);
	    	 out = new PrintWriter(bw);
	    	 System.out.println(newMed +"   "+x);
	    	 out.close();
	    	 fr.close();
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
				sc.close();
				}
				System.out.println(meds.getNames());
				System.out.println(meds.getQuantitities());
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		public static void updateMeds() {
			clearscreen();
			try {
				loaddata();
				File file = new File("Meds.txt");
				displayMeds();
				System.out.println("Please give the name of the med you want to update");
				Scanner sc =new Scanner(System.in);
				String nameofmed = sc.nextLine();
				int index= meds.getNames().indexOf(nameofmed);
				System.out.println(index);
				System.out.println("Give the new quantity");
				String qty =sc.nextLine();
				meds.getQuantitities().set(index, qty);
				System.out.println(meds.getNames());
				System.out.println(meds.getQuantitities());
				sc.close();
			} catch (Exception e) {
				System.out.println("Something went wrong please check the name of your medecine ");
			}
			
			
		  
		    try {
		    	  BufferedWriter writer = new BufferedWriter(new FileWriter("Meds.txt", false));
		    	
		    	  for (int i= 0 ; i<meds.getNames().size();i++) {
		    		  
		    	  
				writer.write('\n');
				writer.write((meds.getNames().get(i)));
				writer.write(' ');
				writer.write((meds.getQuantitities().get(i)));
				 System.out.println("Medecine updated successfully !!");	
				 
		    	  }
				    writer.close();
				    clearscreen();
				   
			} catch (IOException e) {
				System.out.println("Something went wrong");
			}
		   
		   
		
		}
		
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////		 


		public static void FirstMenu() throws IOException {
			clearscreen();
			System.out.println("#________________________________________________________#");
			System.out.println("#---------------------=Pharmacy App----------------------#");
			System.out.println("#________________________________________________________#");
			System.out.println("#                       Main Menu                        #");
			System.out.println("# _______________________________________________________#");
			System.out.println("#           Choose one of the following options          #");
			System.out.println("#                  1.Manage medecines                    #");
			System.out.println("#                   2.Manage Clients                     #");
			System.out.println("#________________________________________________________#");
			
			Scanner gh=new Scanner (System.in);
			int f=gh.nextInt();
			switch (f) {
				case 1: Menumed();
				case 2: Menuclients();
			}
			gh.close();
		}
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
		 public static void Menumed() throws IOException {
			    clearscreen();
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
				
				Scanner en = new Scanner (System.in);
				int y=en.nextInt();
				switch (y){
					case 1: addmeds();
					case 2: displayMeds();
					case 3: deleteMeds();
					case 4: updateMeds();
				}
				en.close();
		        }
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	   
	    ///////////////Clients Part/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    
	    public static void Menuclients() {
	    	
	    }
	    
	    
	    
	    
	}
	

