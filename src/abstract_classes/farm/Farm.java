package abstract_classes.farm;

import java.util.ArrayList;

public class Farm {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<>();
		Chicken ch = new Chicken();
		Cow c = new Cow();
		Sheep s = new Sheep();
		Pig p = new Pig();
		Cow cc = new Cow();
		Pig pp = new Pig();
		animals.add(ch);
		animals.add(c);
		animals.add(s);
		animals.add(p);
		animals.add(cc);
		animals.add(pp);
		for(int i = 0; i < 6; i++) {
			animals.get(i).poo();
			animals.get(i).makeNoise();
		}
	}
}
