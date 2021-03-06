package inl�mningsuppgift1;

public class Hund extends Djur implements Matning{
	
	protected static String f�da = "Hundfoder";
	
	public Hund(String namn, double vikt) {
		super(namn, vikt);
	}
	public String getNamn() {
		return namn;
	}
	@Override
	public double antalMat() {
		antaletMat = vikt/100*1000; //dynamisk bindning, det letar efter den metod som passar "b�st", annars g�r den upp�t till superklassens metod
		return antaletMat;
	}
	@Override
	public String printMe() {
		antalMat();
		return "Du ska mata "+namn+" "+(int)antaletMat+" gram "+f�da;
	}
}
