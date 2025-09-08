
public class Circulo implements Forma{
	private int raio;
	
	public Circulo(int raio) {
		this.raio = raio;
	}
	
	@Override
	public float calcPer() {
		// TODO Auto-generated method stub
		return 2 * 3.14f * raio;
	}

	@Override
	public float calcAr() {
		// TODO Auto-generated method stub
		return 3.14f * (float) Math.pow(raio, 2);
	}

}
