package ma.projet;

public class Triplet<T> {
	
	// les attributs
	private final T premier;
	private final T second ;
	private final T troisieme;
	
	
	// constructeur 
	public Triplet(T premier, T second, T troisieme) {
		
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	// gettrs 
	public T getPremier() {
		return premier;
	}


	public T getSecond() {
		return second;
	}


	public T getTroisieme() {
		return troisieme;
	}
	
	
	// la methode affiche()
	public void affiche() {
		System.out.println("Triplet : {"
				+premier+" , "
				+second+" , "
				+troisieme+" }");
	}
	
	
	

	
	
	
	

}
