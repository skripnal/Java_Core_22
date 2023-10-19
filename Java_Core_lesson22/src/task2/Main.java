package task2;

public class Main {

	public static void main(String[] args) {
		
		Frog frog = new Frog();
		Amphibia amphibia = frog;
		
		amphibia.doAction("їсть", () -> System.out.println("Жаба їсть"));
        amphibia.doAction("спить", () -> System.out.println("Жаба спить"));
        amphibia.doAction("плаває", () -> System.out.println("Жаба плаває"));
        amphibia.doAction("гуляє", () -> System.out.println("Жаба гуляє"));

	}

}
