package animalKingdom;

// class -> blueprint for objects
// abstract class -> blueprint for classes
abstract class AbstractAnimal {
	static int maxId = 0;
	int id;
	String name;
	int year;
	int food;

	public AbstractAnimal(String name, int year) {
		maxId++;
		id = maxId;
		this.name = name;
		this.year = year;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	void consume() {
		food++;
	}

	// getters
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	// setters
	public void setName() {
		this.name = name;
	}

	public void setYear() {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Year: " + year;
	}
}



