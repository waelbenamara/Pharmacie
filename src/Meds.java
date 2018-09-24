import java.util.ArrayList;

public class Meds {
	
//////////Attributes/////////////////////////////	
private ArrayList<String> names=new ArrayList();
private ArrayList<String> quantities = new ArrayList();
///////////////////////////////////////////////////////

//////////Getters/////////////////////////////
public ArrayList<String> getNames() {
	return names;
}

public ArrayList<String> getQuantitities(){
	return quantities ;
}
///////////////////////////////////////////////


//////////Setters///////////////////////////
public void addName(String s ) {
	names.add(s);
}

public void addQuantity(String a ) {
	quantities.add(a);
}

public void updateQuantity(String b ,int i) {
	quantities.set(i,b);
}
}