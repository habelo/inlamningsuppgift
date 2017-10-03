package inl�mningsuppgift1;

abstract public class Djur{  //inkappsling, g�r ej komma �t eftersom det �r protected
	protected String namn;
	protected double vikt;
	protected String f�da;
	protected double antaletMat;
	
	Djur(){}
	
	Djur(String namn, double vikt){
		this.namn=namn;
		this.vikt=vikt;
	}

	protected abstract String printMe();
	protected abstract String getNamn();

}
