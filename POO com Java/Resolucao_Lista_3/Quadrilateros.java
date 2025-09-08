
public abstract class Quadrilateros implements Forma{
	protected int tam1, tam2, tam3, tam4;
	
	public Quadrilateros(int tam1, int tam2, int tam3, int tam4) {
		this.tam1 = tam1;
		this.tam2 = tam2;
		this.tam3 = tam3;
		this.tam4 = tam4;
	}
	
	
	public float calcPer() {
		return tam1 + tam2 + tam3 + tam4;
	}
}
