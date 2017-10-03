package inlämningsuppgift1;

public class Hund extends Djur implements Matning{
	
	protected static String föda = "Hundfoder";
	
	public Hund(String namn, double vikt) {
		super(namn, vikt);
	}
	public String getNamn() {
		return namn;
	}
	@Override
	public double antalMat() {
		antaletMat = vikt/100*1000;
		return antaletMat;
	}
	@Override
	public String printMe() {
		antalMat();
		return "Du ska mata "+namn+" "+(int)antaletMat+" gram "+föda;
	}
}
