package animalKingdom;

// class -> blueprint for objects
// abstract class -> blueprint for classes
abstract class AbstractAnimal {
	static int maxId = 0;
	int id;
	String name;
	int year;

	public AbstractAnimal(String name, int year) {
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}
	
	// parent and child should know about the field
	protected int food;

	// default constructor
	public AbstractAnimal() {
		food = 1;
	}

	public AbstractAnimal() {
		this.food = food;
	}

	abstract String getName();
	abstract String getId();
}