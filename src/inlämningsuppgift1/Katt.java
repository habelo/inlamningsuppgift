package inlämningsuppgift1;

public class Katt extends Djur implements Matning{
	
	protected static String föda = "Kattfoder";
	
	public Katt(String namn, double vikt) {
		super(namn, vikt);
	}
	public String getNamn() {
		return namn;
	}
	@Override
	public double antalMat() {
		antaletMat = vikt/150*1000;
		return antaletMat;
	}
	@Override
	public String printMe() {
		antalMat();
		return "Du ska mata "+namn+" "+(int)antaletMat+" gram "+föda;
	}
}
