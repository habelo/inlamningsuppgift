package inlämningsuppgift1;

import javax.swing.JOptionPane;
import java.util.*;

public class Inlämningsuppgift1 {
	public static void main(String[] args) {
		Inlämningsuppgift1 ö = new Inlämningsuppgift1();
		ö.backEnd();
		
	}
	
	public void backEnd() {
		List<Matning> djuren = new ArrayList<>();
		Hund sixten = new Hund("Sixten", 5);
		Hund dogge = new Hund("Dogge", 10);
		Katt venus= new Katt("Venus", 5);
		Katt ove= new Katt("Ove", 3);
		Orm hypno= new Orm("Hypno", 1);
		
		djuren.add(ove);
		djuren.add(venus);
		djuren.add(dogge);
		djuren.add(sixten);
		djuren.add(hypno);
		
		String s = (JOptionPane.showInputDialog("Vem vill du mata: "));
		
		for (int i = 0; i < djuren.size(); i++) {
			if(s.toLowerCase().equals(djuren.get(i).getNamn().toLowerCase())) {
			System.out.println(djuren.get(i).printMe());
			break;
			}
			
		}
		
	}
}
