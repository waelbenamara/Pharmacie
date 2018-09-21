import java.util.ArrayList;

public class Meds {
//////////Attributes/////////////////////////////	
private ArrayList<String> names=new ArrayList();
private ArrayList<Integer> quantities = new ArrayList();
///////////////////////////////////////////////////////

//////////Getters/////////////////////////////
public ArrayList<String> getNames() {
	return names;
}

public ArrayList<Integer> getQuantitities(){
	return quantities ;
}
///////////////////////////////////////////////


//////////Setters///////////////////////////
public void addName(String s ) {
	names.add(s);
}

public void addquantity(int a ) {
	quantities.add(a);
}

public void updatequantity(int b ,int i) {
	quantities.set(i,b);
}
}
