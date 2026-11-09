package ma.projet;

public class TripletH<A, B, C> {
	// attributs
	private final A premier;
	private final B second;
	private final C troisieme;

	// constructeur

	public TripletH(A premier, B second, C troisieme) {
		super();
		this.premier = premier;
		this.second = second;
		this.troisieme = troisieme;
	}

	// les getters
	public A getPremier() {
		return premier;
	}

	public B getSecond() {
		return second;
	}

	public C getTroisieme() {
		return troisieme;
	}

	// la methode affiche()
	public void affiche() {
		System.out.println("Triplet : {" + premier + " , " + second + " , " + troisieme + " }");
	}

}
