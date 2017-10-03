package inlämningsuppgift1;

abstract public class Djur{
	protected String namn;
	protected double vikt;
	protected String föda;
	protected double antaletMat;
	
	Djur(){}
	
	Djur(String namn, double vikt){
		this.namn=namn;
		this.vikt=vikt;
	}

	public abstract String printMe();
	public abstract String getNamn();

}
