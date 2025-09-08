
public class Quadrado extends Quadrilateros{

	
	
	public Quadrado(int tam1, int tam2, int tam3, int tam4) {
		super(tam1, tam2, tam3, tam4);
		// TODO Auto-generated constructor stub
	}
	
	public Quadrado(int lado) {
		super(lado, 0, 0, 0);
		// TODO Auto-generated constructor stub
	}
	
	public float calcPer() {
		return tam1 * 4;
	}

	@Override
	public float calcAr() {
		// TODO Auto-generated method stub
		return (float) Math.pow(tam1, 2);
	}

}
