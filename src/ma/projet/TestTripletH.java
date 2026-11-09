package ma.projet;

public class TestTripletH {
public static void main(String[] args) {
	
	
	TripletH<Integer,String,Double> th= new TripletH<>(43,"Valeur",25.4);
	
	th.affiche();
	
	
	TripletH<String,Boolean,Double> th2 =new TripletH<>("Assiya",true,26.5);
	
	th2.affiche();
	
	
	System.out.println("le second element : "+th2.getSecond());
}
}
