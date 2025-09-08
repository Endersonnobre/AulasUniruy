
public class Retangulo extends Quadrilateros{

	public Retangulo(int tam1, int tam2, int tam3, int tam4) {
		super(tam1, tam2, tam3, tam4);
		// TODO Auto-generated constructor stub
	}
	
	public Retangulo(int base, int altura) {
		super(base, altura, 0, 0);
		// TODO Auto-generated constructor stub
	}
	
	public float calcPer() {
		return 2 *(tam1 * tam2);
	}

	@Override
	public float calcAr() {
		// TODO Auto-generated method stub
		return tam1 * tam2;
	}

}
