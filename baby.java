class Baby {
	// Instance Variables
	private String name;
	private int height;
	private int weight;

	// Encapsulation
	public String getName() {
		return name;
	}
	public void setName(String n) {
		name = n;
	}

	public int getHeight() {
		return height;
	}
	public void setHeight(int h) {
		height = h;
	}

	public int getWeight() {
		return weight;
	}
	public void setWeight(int w) {
		weight = w;
	}

	// Method
	void comment() {
		if (height > 60 && weight > 5) {
			System.out.println("My god this baby is tall and heavy!");
		} else if (height > 60 && weight <= 5) {
			System.out.println("My god this baby is tall! He isn't that heavy though.");
		} else if (height <= 60 && weight > 5) {
			System.out.println("My god this baby is heavy! He isn't that tall though. What a fatty.");
		} else if (height <= 60 && weight <= 5) {
			System.out.println("My god this baby looks healthy and cute!");
		}
	}
}

class BabyTestDrive {
	public static void main (String[] args) {
		Baby one = new Baby();
		one.setName("Bolle");
		one.setHeight(55);
		one.setWeight(8);
		Baby two = new Baby();
		two.setName("Olle");
		two.setHeight(52);
		two.setWeight(4);
		System.out.println("A new baby is born! His/her name is " + one.getName() + ".");
		one.comment();
		System.out.println("This baby weighs " + one.getWeight() + "kg and is " + one.getHeight() + "cm tall.");
		System.out.println("A new baby is born! His/her name is " + two.getName() + ".");
		two.comment();
		System.out.println("This baby weighs " + two.getWeight() + "kg and is " + two.getHeight() + "cm tall.");
	}
}