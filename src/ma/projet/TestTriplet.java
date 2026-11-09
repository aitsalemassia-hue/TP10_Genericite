package ma.projet;

public class TestTriplet {
	public static void main(String[] args) {
		//triplet d'entiers
		
		Triplet<Integer> tInt= new Triplet<>(12,14,16);
		tInt.affiche();
		
		
		// triplet de chaines
		
		Triplet<String> tString= new Triplet<>("Assiya","Salma","anas");
		tString.affiche();
		
		
		
		// triplet de  reels
		Triplet<Double> tDouble= new Triplet<>(1.0,0.98,1.6);
		tDouble.affiche();
		
		
		
		//utilisation des getters
		System.out.println("troisieme element de tString :" +tString.getTroisieme());
		
	}

}
