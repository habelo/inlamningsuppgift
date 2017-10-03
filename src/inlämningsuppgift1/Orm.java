package inlämningsuppgift1;

public class Orm extends Djur implements Matning{
	
	protected static String föda = "Ormpoletter";
	
	public Orm( String namn, double vikt) {
		super(namn, vikt);
	}
	public String getNamn() {
		return namn;
	}
	@Override
	public double antalMat() {
		antaletMat=20;
		return antaletMat;
	}
	@Override
	public String printMe() {
		antalMat();
		return "Du ska mata "+namn+" "+(int)antaletMat+" gram "+föda;
	}

}
