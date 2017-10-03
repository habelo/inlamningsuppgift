package inl�mningsuppgift1;

import javax.swing.JOptionPane;
import java.util.*;

public class Inl�mningsuppgift1 {
	public static void main(String[] args) {
		Inl�mningsuppgift1 � = new Inl�mningsuppgift1();
		�.backEnd();
		
	}
	
	public void backEnd() {
		List<Matning> djuren = new ArrayList<>();
		Matning sixten = new Hund("Sixten", 5);
		Matning dogge = new Hund("Dogge", 10);
		Matning venus= new Katt("Venus", 5);
		Matning ove= new Katt("Ove", 3);
		Matning hypno= new Orm("Hypno", 1);
		
		djuren.add(ove);
		djuren.add(venus);
		djuren.add(dogge);
		djuren.add(sixten);
		djuren.add(hypno);
		
		String s = (JOptionPane.showInputDialog("Vem vill du mata: "));
		
		for (int i = 0; i < djuren.size(); i++) {
			if(s.equalsIgnoreCase(djuren.get(i).getNamn())) { //h�r anv�nds polymorfism d�r interfacet k�nner av vilket slags djur det �r och ger dess skepnad i form av givna metod ".getNamn()"
			System.out.println(djuren.get(i).printMe());
			break;
			}
			
		}
		
	}
}
