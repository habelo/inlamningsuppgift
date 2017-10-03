package inlämningsuppgift1;

abstract public class Djur{  //inkappsling, går ej komma åt eftersom det är protected
	protected String namn;
	protected double vikt;
	protected String föda;
	protected double antaletMat;
	
	Djur(){}
	
	Djur(String namn, double vikt){
		this.namn=namn;
		this.vikt=vikt;
	}

	protected abstract String printMe();
	protected abstract String getNamn();

}
