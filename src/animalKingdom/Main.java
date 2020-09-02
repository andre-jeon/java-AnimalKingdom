package animalKingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		System.out.println("Welcome to Animal Kingdom!!!");

		// creating mammals
		Mammal panda = new Mammal("Panda", 1869); 
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		// creating birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		// creating fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// ArrayList
		List<AbstractAnimal> myList = new ArrayList<>();

		myList.add(panda);
		myList.add(zebra);
		myList.add(koala);
		myList.add(sloth);
		myList.add(armadillo);
		myList.add(raccoon);
		myList.add(bigfoot);

		myList.add(pigeon);
		myList.add(peacock);
		myList.add(toucan);
		myList.add(parrot);
		myList.add(swan);

		myList.add(salmon);
		myList.add(catfish);
		myList.add(perch);

		System.out.println(myList);

		System.out.println("\nList all the animals in descending order by year named");
		myList.sort((v1, v2) -> v2.getYear() - v1.getYear()); // descending order
		// myList.sort((v1, v2) -> v1.getYear() - v2.getYear()); // ascending order

		myList.forEach((v) -> System.out.println(v)); // prints nicely

		System.out.println("\nList all the animals alphabetically");
		myList.sort((v1, v2) -> v1.getName().compareToIgnoreCase(v2.getName()));

		myList.forEach((v) -> System.out.println(v));

		System.out.println("\nList all the animals order by how they move");
		myList.sort((v1, v2) -> v1.move().compareToIgnoreCase(v2.move()));

		myList.forEach((v) -> System.out.println(v));

		System.out.println("\nList all the animals order by how they move");
		

	}
}