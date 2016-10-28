public class ForWhileLooping {
	public static void main(String[] args) {
		String newLine = System.getProperty("line.separator");

		GetAgeInput getageinput = new GetAgeInput();

		String arneAge = getageinput.getUserInput("Wat is de leeftijd van Arne?");
		int arne = Integer.parseInt(arneAge);

		System.out.println(newLine + "Arne is: " + newLine);

		for (arne = 0; arne < 29; arne++) {
			System.out.print(arne + " ");
		}
		System.out.println(newLine + newLine + "jaar en Niels is: " + newLine);
		String nielsAge = getageinput.getUserInput("Wat is de leeftijd van Niels?");
		int nielsage = Integer.parseInt(nielsAge);

		int niels = 0;
		while (niels < 31) {
			System.out.print(niels + " ");
			niels++;
		}
		System.out.println(newLine + newLine + "jaar." + newLine);
	}
}